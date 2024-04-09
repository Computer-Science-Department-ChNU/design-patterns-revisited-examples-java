package ua.chnu.edu.kkn.patterns.revisited.execute_around;

import java.util.function.Consumer;

class Resource {

    private Resource() {
        System.out.println("creating an external resource");
    }

    public static void use(Consumer<Resource> block) {
        Resource resource = new Resource();
        try {
            block.accept(resource);
        } finally {
            resource.close();
        }
    }

    public Resource op1() {
        System.out.println("op1");
        return this;
    }

    public Resource op2() {
        System.out.println("op2");
        return this;
    }

    private void close() {
        System.out.println("cleaning up external resource");
    }
}
public class Main {

    public static void main(String[] args) {
        Resource.use(resource -> resource.op1().op2());
    }
}
