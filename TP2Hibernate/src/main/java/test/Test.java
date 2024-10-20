package test;

import entities.Salle;
import entities.Machine;
import services.MachineService;
import services.SalleService;

import java.util.Date;

public class Test {

    public static void main(String[] args) {

        MachineService ms = new MachineService();
        SalleService ss = new SalleService();

        //Création et insertion de salles
        //ss.create(new Salle("salle1"));
        //ss.create(new Salle("salle2"));

        //Création et insertion de machines
        //ms.create(new Machine("Machine1", new Date(), ss.findById(18)));
        //ms.create(new Machine("Machine2", new Date(), ss.findById(19)));

        // Affichage des salles et leurs machines
        System.out.println("####### Les codes des salles sont : #######");
        int i=0;
        for (Salle s : ss.findAll()) {
            System.out.println("Le code de la salle "+ (++i) +" est : " + s.getCode());
            System.out.println("####### Les references des Machines #######");
            int j=0;
            for (Machine m : s.getMachines()) {
                System.out.println("La réference de la machine: "+ (++j) +" est : " + m.getRef());
            }
        }

        //Utlisation de la méthode findBetweenDate
        Date d1 = new Date(120, 1, 3);
        Date d2 = new Date();
        System.out.println("---------------Machine achetées entre les dates" + d1 + " et " + d2 + " sont :");
        for (Machine m : ms.findBetweenDate(d1, d2)) {
            System.out.println(m.getRef() + "** achetée le " + m.getDateAchat());
        }


    }


}
