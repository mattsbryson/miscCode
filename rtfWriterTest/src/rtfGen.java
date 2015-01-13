import static com.tutego.jrtf.Rtf.rtf;
import static com.tutego.jrtf.RtfDocfmt.*;
import static com.tutego.jrtf.RtfHeader.*;
import static com.tutego.jrtf.RtfInfo.*;
import static com.tutego.jrtf.RtfFields.*;
import static com.tutego.jrtf.RtfPara.*;
import static com.tutego.jrtf.RtfSectionFormatAndHeaderFooter.*;
import static com.tutego.jrtf.RtfText.*;
import static com.tutego.jrtf.RtfUnit.*;
import java.io.FileWriter;
import java.io.IOException;


public class rtfGen 
{

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException 
	{
		FileWriter rtfWriter = new FileWriter("out.rtf");
	//	rtf().section( p( "Hello World" ) ).out(rtfWriter);
	//	rtf().section(p("Text "), p(bold("this awesome bold text"))).out(rtfWriter);
		rtf().section(p( "lala" ),
row( "Number", "Square" ),
row( 1, 1 ),
row( 2, 4 ),
p( "lulu" )).out(rtfWriter);

	}

}
