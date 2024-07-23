package compositeDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem{

    String name;
    public List<FileSystem>files ;

    public Directory(String name){
        this.name=name;
        files = new ArrayList<FileSystem>();
    }

    public void addFile(FileSystem newFile){
        files.add(newFile);
    }

    @Override
    public void ls() {
        System.out.println(name + ":");
        for(FileSystem obj:files){
            obj.ls();
        }
    }
    
}
