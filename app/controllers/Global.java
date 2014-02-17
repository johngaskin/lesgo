import play.*;
import play.libs.*;
import com.avaje.ebean.Ebean;
import models.*;
import java.util.*;

/**
 * Created by john on 17/02/14.
 */
public class Global extends GlobalSettings{

    @Override
    public void onStart(Application app) {
        //Check if the database is empty
        if(User.find.findRowCount() == 0) {
            Ebean.save((List) Yaml.load("initial-data.yml"));
        }
    }
}
