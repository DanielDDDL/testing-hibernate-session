package br.mackenzie.lfs.whatisconsideredwhenpersisted.aspects;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class AspectTest {

    public void say(String message) {
        System.out.println(message);
    }

    public void say1(String message) {
        System.out.println(message);
    }

    public void say2(String message) {
        System.out.println(message);
    }

    @Moo
    public void hey(String message, String second) {
        System.out.println(message);
    }


    //aplicar a coisas que nao beans
    //pegar a parti de uma anotacao
    //alterar valores de um metodo

}
