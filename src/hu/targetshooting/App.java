package hu.targetshooting;

import hu.targetshooting.controller.ShotService;
import hu.targetshooting.model.sevice.DataApi;
import hu.targetshooting.model.sevice.DataParser;
import hu.targetshooting.model.sevice.FileReader;

public class App {

    private final ShotService service;

    private App() {
        DataApi dataApi = new DataApi(
                new FileReader("verseny.txt"),
                new DataParser());
        service = new ShotService(dataApi.getData());
    }

    public static void main(String[] args) {
        new App().run();
    }

    private void run() {
        System.out.println("Céllövészet");
    }
}
