   package com.curso.tiendaapi.controlador;

   import org.springframework.web.bind.annotation.GetMapping;
   import org.springframework.web.bind.annotation.RestController;

   // @RestController: esta clase responde peticiones HTTP
   @RestController
   public class HolaController {

       // Cuando llegue un GET a /api/hola, se ejecuta este método
       @GetMapping("/api/hola")
       public String saludar() {
           return "Hola desde Spring Boot";
       }
   }