package com.kelaniya.uni.g5.reports;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.kelaniya.uni.g5.repository.DBConnection;

import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DetailedReport implements Report {

    public void execute(String startingTime, String endingTime){

        try {
            String file_name="E:\\Desktop\\SCGroup\\GenaratePDF\\test.pdf";
            Document document = new Document();
            PdfWriter.getInstance(document,new FileOutputStream(file_name));
            document.open();

            DBConnection obJDBConnection = new DBConnection();
            Connection connection=obJDBConnection.getConnection();
            PreparedStatement ps=null;
            ResultSet rs=null;

            String query="SELECT * FROM orders WHERE order_date BETWEEN '"+startingTime+"' AND '"+endingTime+"'" ;

            ps=connection.prepareStatement(query);
            rs=ps.executeQuery();


            while (rs.next()) {


                //add Table

                PdfPTable table = new PdfPTable(6);

                PdfPCell c1 = new PdfPCell(new Phrase("order_id"));
                table.addCell(c1);

                PdfPCell c2 = new PdfPCell(new Phrase("customer_id"));
                table.addCell(c2);

                PdfPCell c3 = new PdfPCell(new Phrase("product_id"));
                table.addCell(c3);

                PdfPCell c4 = new PdfPCell(new Phrase("qty"));
                table.addCell(c4);

                PdfPCell c5 = new PdfPCell(new Phrase("trx_id"));
                table.addCell(c5);

                PdfPCell c6 = new PdfPCell(new Phrase("order_date"));
                table.addCell(c6);


                table.setHeaderRows(1);

                table.addCell(rs.getString("order_id"));
                table.addCell(rs.getString("customer_id"));
                table.addCell(rs.getString("product_id"));
                table.addCell(rs.getString("qty"));
                table.addCell(rs.getString("trx_id"));
                table.addCell(rs.getString("order_date"));

                document.add(table);

                document.add(new Paragraph(" "));
            }


            document.close();

            System.out.println("Finish");
        }
        catch (Exception e)
        {
            System.err.println(e);
        }







    }

}
