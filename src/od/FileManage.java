package od;

import java.util.*;

public class FileManage {
    static class folder{
        folder parent;
        List<folder> children = new ArrayList<>();
        String name;
        folder(String name, folder parent){
            this.name= name;
            this.parent = parent;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        folder root = new folder("",null);
        folder curr = root;
        Deque<String> q = new LinkedList<>();
        q.addLast(root.name);

        while(in.hasNextLine()){
            String[] command = in.nextLine().split(" ");
            if("mkdir".equals(command[0]) && command.length>1 && !command[1].isEmpty()){
                mkdir(curr,command[1]);
            }else if("cd".equals(command[0])){
                if("..".equals(command[1])){
                    if(curr.name!=""){
                        curr = curr.parent;
                        q.removeLast();
                    }
                }
                else{
                    for(folder f:curr.children){
                        if(f.name.equals(command[1])){
                            curr = f;
                            q.addLast(f.name);
                        }
                    }
                }
            } else if ("pwd".equals(command[0])) {
                StringBuilder path = new StringBuilder();
                for(String str: q){
                    path.append(str);
                    path.append('/');
                }
                System.out.println(path.toString());
            }
        }
    }

    private static void mkdir(folder curr, String s) {
        boolean flag = true;
        for(folder f: curr.children){
            if(f.name.equals(s)) flag = false;
        }
        if(flag){
            folder f = new folder(s,curr);
            curr.children.add(f);
        }
    }
}
