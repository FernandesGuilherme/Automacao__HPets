package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;

import utils.Browser;

public class HookSteps {

    @Before
    public static void inicio(){
        Browser.AbrirNavegador();
    }

//    @After
//    public static void fim(){
//        Browser.fecharNavegador();
//    }
}
