public class Main {
    public static void main(String[] args) {
        Node root = null;
        TreeList arbol = new TreeList();
        try{
           root = arbol.push(7,root);  
           arbol.push(3,root); 
           arbol.push(8,root); 
           arbol.push(2,root); 
           arbol.push(6,root); 
           arbol.push(1,root); 
           arbol.push(5,root); 
           arbol.push(10,root); 
           arbol.push(4,root); 
           arbol.push(9,root); 
        }catch(Exception e){
            
        }
        
        arbol.printTree(root, "");
        
        
    }
}
