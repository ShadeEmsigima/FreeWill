public interface IBeNice {
    default void Greet(){
        System.out.println("IBeNice - the " + this.getClass().getSimpleName().toLowerCase() + " smiles and waves at the guests");
    }
}
