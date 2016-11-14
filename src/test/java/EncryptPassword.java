import com.metaopsis.icspasswd;
import org.junit.Test;

/**
 * Created by tbennett on 11/14/16.
 */
public class EncryptPassword {

    @Test
    public void TestEncryption()
    {
        String[] args = {"lak3v13w.c0m"};
        icspasswd.main(args);
    }

    @Test
    public void TestNoArgs()
    {
        String[] args = new String[0];
        icspasswd.main(args);
    }
}
