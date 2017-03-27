package edu.matc.tagLibDemo;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by bmodahl on 3/27/17.
 */
public class GreetingTag extends SimpleTagSupport {

    @Override
    public void doTag() throws JspException, IOException {
        super.doTag();

        Date date = new Date();

        int time = Integer.parseInt(new SimpleDateFormat("HH").format(date));

        int day = Integer.parseInt(new SimpleDateFormat("dd").format(date));

        int month = Integer.parseInt(new SimpleDateFormat("MM").format(date));


        JspWriter out= getJspContext().getOut();

        if (day == 31 && month == 8) {
            out.println("HAPPY HALLOWEEN!!");
        }


        if (time <= 12) {
            out.println("Toooo Early!!");
        } else if (time > 12 && time < 18) {
            out.println("Good Afternoon!");
        } else {
            out.println("Do you know what time it is?!");
        }


    }
}

