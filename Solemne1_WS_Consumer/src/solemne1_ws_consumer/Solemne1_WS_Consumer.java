/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solemne1_ws_consumer;

/**
 *
 * @author Paolo-Acer
 */
public class Solemne1_WS_Consumer {
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(getData("id003"));
    }
    private static String getData(java.lang.String id) {
        solemne1.Control1Webservice_Service service = new solemne1.Control1Webservice_Service();
        solemne1.Control1Webservice port = service.getControl1WebservicePort();
        return port.getData(id);
    }

    private static String hello(java.lang.String name) {
        solemne1.Control1Webservice_Service service = new solemne1.Control1Webservice_Service();
        solemne1.Control1Webservice port = service.getControl1WebservicePort();
        return port.hello(name);
    }

    /**
     * @param args the command line arguments
     */


    
}
