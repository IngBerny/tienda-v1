package com.tienda.controller;

import com.tienda.domain.Usuario;
import com.tienda.service.ReportService;
import java.io.IOException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/reportes")

public class ReporteController {
    
    @Autowired
    ReportService reportService;
    
    @GetMapping("/principal")
    public String principal(Model model) {
        return "/reportes/principal";
    }
    
    @GetMapping("/usuarios")
    public ResponseEntity<Resource> usuarios(@RequestParam String tipo) throws IOException {
        return reportService.generaReporte("usuarios",null,tipo);
    }
    @GetMapping("/ventas")
    public ResponseEntity<Resource> ventas(@RequestParam String tipo) throws IOException {
        return reportService.generaReporte("ventas",null,tipo);
    }
    @GetMapping("/productos1")
    public ResponseEntity<Resource> productos(@RequestParam String tipo) throws IOException {
        return reportService.generaReporte("productos",null,tipo);
    }
    @GetMapping("/totalventas")
    public ResponseEntity<Resource> totalventas(@RequestParam String tipo) throws IOException {
        return reportService.generaReporte("totalventas",null,tipo);
    }
}
