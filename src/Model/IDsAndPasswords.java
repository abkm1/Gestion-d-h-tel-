package Model;
import java.util.HashMap;
public class IDsAndPasswords {
HashMap<String,String> LoginInfo = new HashMap<String,String>();

public IDsAndPasswords()
{
    LoginInfo.put("Safwane","001");
    LoginInfo.put("Abdelkarim Guenane","002");
    LoginInfo.put("Mohamed Said Nail ","003");
    LoginInfo.put("1","1");
}

public HashMap<String, String> getLoginInfo ()
{
    return LoginInfo ;
}
}
