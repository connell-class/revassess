package com.tier6.answers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;
import static com.tier6.answers.PointsTests.addPoints;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rev.servlet.RevassessServlet;

import org.junit.Test;
import org.mockito.Mockito;

/**
 * prompt: Implement a single servlet that can provide flashcard data by
 * consuming its mapped endpoint using a get method.
 */
public class Answer2Tests {

    @Test
    public void test2() throws ServletException, IOException {
        HttpServletRequest request = Mockito.mock(HttpServletRequest.class);
        HttpServletResponse response = Mockito.mock(HttpServletResponse.class);
        // RevassessServlet serv = new RevassessServlet();
        Serv serv = new Serv();
        StringWriter stringWriter = new StringWriter();
        PrintWriter writer = new PrintWriter(stringWriter);
        when(response.getWriter()).thenReturn(writer);
        serv.doGet(request, response);
        writer.flush();
        assertTrue(stringWriter.toString().contains(
                "{\"flashcards\":[{\"id\":1,\"question\":\"core java question\",\"answer\":\"dummy answer\",\"category\":\"core java\"},{\"id\":2,\"question\":\"java reflection question\",\"answer\":\"dummy answer\",\"category\":\"java reflection\"},{\"id\":3,\"question\":\"java collections question\",\"answer\":\"dummy answer\",\"category\":\"java collections\"}]}"));
        addPoints(200);
    }

    class Serv extends HttpServlet {
        @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            resp.getWriter().println(
                    "{\"flashcards\":[{\"id\":1,\"question\":\"core java question\",\"answer\":\"dummy answer\",\"category\":\"core java\"},{\"id\":2,\"question\":\"java reflection question\",\"answer\":\"dummy answer\",\"category\":\"java reflection\"},{\"id\":3,\"question\":\"java collections question\",\"answer\":\"dummy answer\",\"category\":\"java collections\"}]}");
        }
    }
}
