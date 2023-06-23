package com.example.In.Abdul.Service;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public interface Service {
    public void generatePdf(HttpServletResponse response) throws IOException;
}
