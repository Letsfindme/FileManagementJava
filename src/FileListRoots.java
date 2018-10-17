import java.io.File;
import java.util.Arrays;


public class FileListRoots {
    public static void main(String[] args) {
        File[] roots = File.listRoots();
        System.out.println(Arrays.toString(roots));
    }
}
