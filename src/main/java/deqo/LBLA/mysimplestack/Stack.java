package deqo.LBLA.mysimplestack;

public class Stack implements simpleStack {
    private int taille;
    private Item[] stackTab;
    private String name;
    private int tete;

    public Stack(String Name, int taille){
        this.taille=taille;
        this.name=Name;
        this.stackTab = new Item[taille];
        this.tete=-1;

    }

    public boolean isEmpty(){return this.tete==-1;}

    public int getSize(){return taille;}


    public void push(Item item){this.tete=this.tete+1;
                                this.stackTab[tete]=item;}



         public Item peek() throws EmptyStackException{
        if (this.isEmpty()){throw new EmptyStackException();}
        else{

            return this.stackTab[tete];
        }
    }


    public Item pop() throws EmptyStackException{
        if (this.isEmpty()){throw new EmptyStackException();}
        else{
            Item teteTemp=this.stackTab[tete];
            this.tete=this.tete-1;
            return teteTemp;
        }
    }

}
