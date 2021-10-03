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

public class SummaryReport implements Report {

    public void execute(String startingTime, String endingTime){


        try{

            String file_name="E:\\Desktop\\SCGroup\\GenaratePDF\\report.pdf";
            Document document = new Document();
            PdfWriter.getInstance(document,new FileOutputStream(file_name));
            document.open();

            DBConnection obJDBConnection = new DBConnection();
            Connection connection=obJDBConnection.getConnection();
            PreparedStatement preparedStatement=null;
            ResultSet resultSet=null;

            String query="SELECT order_id, customer_id, product_id, qty, p_status, order_date FROM orders WHERE order_date BETWEEN '"+startingTime+"' AND '"+endingTime+"'" ;

            preparedStatement=connection.prepareStatement(query);
            resultSet=preparedStatement.executeQuery();


            while (resultSet.next()) {


                //add Table

                PdfPTable table = new PdfPTable(5);

                PdfPCell c1 = new PdfPCell(new Phrase("order_id"));
                table.addCell(c1);

                PdfPCell c2 = new PdfPCell(new Phrase("customer_id"));
                table.addCell(c2);

                PdfPCell c3 = new PdfPCell(new Phrase("product_id"));
                table.addCell(c3);

                PdfPCell c4 = new PdfPCell(new Phrase("qty"));
                table.addCell(c4);

                PdfPCell c5 = new PdfPCell(new Phrase("order_date"));
                table.addCell(c5);


                table.setHeaderRows(1);

                table.addCell(resultSet.getString("order_id"));
                table.addCell(resultSet.getString("customer_id"));
                table.addCell(resultSet.getString("product_id"));
                table.addCell(resultSet.getString("qty"));
                table.addCell(resultSet.getString("order_date"));

                document.add(table);

                document.add(new Paragraph(""));
            }

            document.add(new Paragraph("Inventory Summery"));
            document.add(new Paragraph(" "));

            String queryProducts="SELECT * FROM products";

            preparedStatement=connection.prepareStatement(queryProducts);
            resultSet=preparedStatement.executeQuery();

            while (resultSet.next()) {

                //add Table

                PdfPTable table = new PdfPTable(4);

                PdfPCell c1 = new PdfPCell(new Phrase("product_id"));
                table.addCell(c1);

                PdfPCell c2 = new PdfPCell(new Phrase("product_title"));
                table.addCell(c2);

                PdfPCell c3 = new PdfPCell(new Phrase("product_price"));
                table.addCell(c3);

                PdfPCell c4 = new PdfPCell(new Phrase("product_availabla_qty"));
                table.addCell(c4);

                table.setHeaderRows(1);

                table.addCell(resultSet.getString("product_id"));
                table.addCell(resultSet.getString("product_title"));
                table.addCell(resultSet.getString("product_price"));
                table.addCell(resultSet.getString("product_qty"));


                document.add(table);

                document.add(new Paragraph(" "));
            }

            document.close();

            System.out.println("Summery Report Created");
        }
        catch (Exception e)
        {
            System.err.println(e);
        }

    }

}
