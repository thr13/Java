package src.day35;

import lombok.Data;

import java.util.Date;

@Data
public class Boards {
    private int bno;
    private String btitle;
    private String bcontent;
    private String bwriter;
    private Date bdate;
}
