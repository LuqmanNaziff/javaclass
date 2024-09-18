import java.lang.classfile.instruction.LocalVariable;

public class DifferentScopes {

    int instanceVariable = 10;
    double instanceVariableDoble = 10.8;
    String instaceVariableString = "This is a string";

    static int instanceVariableStatic = 20;

    public void showLocalVariable(){
        String localStringVariables = "Finish";
        int localVariable = 30;
        System.out.println("My local Variable is: " + localVariable + " " + localStringVariables);
    }
    public static void main(String[] args){
        DifferentScopes example = new DifferentScopes();
        example.showLocalVariable();
        System.out.println("My local Variable is: " + example.instanceVariable + " " + example.instaceVariableString);
    }
}
