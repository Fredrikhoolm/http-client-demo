package no.kristiania.httpclient;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class QueryStringTest {

    @Test
    void shouldRetrieveQueryParameter(){
        QueryString queryString = new QueryString("status=200");
        assertEquals("200", queryString.getParameter("status"));
    }

    @Test
    void shouldRetrieveOtherQueryParameter(){
        QueryString queryString = new QueryString("status=200");
        assertEquals("404", queryString.getParameter("status"));
    }

    @Test
    void shouldRetrieveParametersByName(){
        QueryString queryString = new QueryString("text=Hello");
        assertEquals(null, queryString.getParameter("status"));
        assertEquals("Hello", queryString.getParameter("text"));
    }

    @Test
    void shouldHandlemultipleParameters(){
        QueryString queryString = new QueryString("text=Hello&status=200");
        assertEquals(200, queryString.getParameter("status"));
        assertEquals("Hello", queryString.getParameter("text"));
    }
}
