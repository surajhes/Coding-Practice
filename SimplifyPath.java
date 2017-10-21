import java.util.Stack;

/**
 * Created by suraj on 10/18/2017.
 */
public class SimplifyPath {
    public static void main(String[] args) {
        SimplifyPath path = new SimplifyPath();
        System.out.println(path.simplifyPath("/home/a/./x/../b//c/"));
    }
    String simplifyPath(String path){
        StringBuilder stringBuilder = new StringBuilder();
        String dirs[] = path.split("/");
        Stack<String> stack = new Stack<>();
        for(String dir:dirs){
            if(!dir.isEmpty()){
                if(dir.equals(".")){
                }else if(dir.equals("..")){
                    if(stack.isEmpty()){
                    }else{
                        stack.pop();
                    }
                }
                else{
                    stack.push(dir);
                }
            }
        }
        for(String dir:stack){
            stringBuilder.append("/").append(dir);
        }
        if(stack.isEmpty()){
            stringBuilder.append("/");
        }
        return stringBuilder.toString();
    }
}
