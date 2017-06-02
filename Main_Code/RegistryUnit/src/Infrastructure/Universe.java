/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Infrastructure;

import java.util.ArrayList;
import java.util.HashMap;
import webServer.Server;

/**
 *
 * @author billaros
 */
public class Universe {

    //final Tassadar executor;
    ArrayList<Aggregator> aggregators;
    ArrayList<Communication> comms;
    HashMap<String,Service> services; //uri object
    Server myServer;

    public Universe() {
        services = new HashMap();
        myServer = new Server(this);
        myServer.startServer();
        aggregators = new ArrayList<Aggregator>();
        comms = new ArrayList<Communication>();
    }

}
