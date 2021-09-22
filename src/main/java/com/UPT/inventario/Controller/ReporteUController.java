package com.UPT.inventario.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.UPT.inventario.Facade.ReporteUFacade;
import com.UPT.inventario.Model.Reporte_usuario;
import java.util.List;
import java.util.ArrayList;

@RestController
@RequestMapping("/API")
public class ReporteUController {

    @Autowired
    private ReporteUFacade reporteUFacade;

    @GetMapping("/getAllReportsU")
    public List<Reporte_usuario> getAllReportsU() {
        List<Reporte_usuario> reporteUsuario = new ArrayList<Reporte_usuario>();
        reporteUsuario = reporteUFacade.getAllReporteUsuario();
        return reporteUsuario;
    }
    
}
