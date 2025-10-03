
package createLabubu;

public class rareLabubu extends Labubu{

    public rareLabubu(String name, String owner, int age, char check){
        super(name,owner,age,check);
    }

    public static void main(String [] args){
        rareLabubu rareLabubu = new rareLabubu("Cesar", "Jr", 100, 't');

        rareLabubu.labubuInformationOutput();
    }

}
