package algorithm.listnode;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

/**
 * @Author Mahe
 * @Date 2021/3/28 16:34
 * @Version 1.0
 */
public class Cat {

    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public Cat() {
    }

    public static void main(String[] args) throws Throwable {

        for (int i = 0 ; i < 1000000; i++) {

            Cat cat = new Cat();
            cat.finalize();// The first object becomes available for garbage collection here
        }
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("The Cat is destroyed!");
    }
}
