/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.16.0.2388 modeling language!*/

package cruise.umple.compiler;
import java.util.*;

/**
 * @umplesource Umple.ump 271
 * A block of code in an arbitrary language to be injected into generated code
 */
// line 274 "../../../../src/Umple.ump"
// line 464 "../../../../src/Umple_Code.ump"
public class CodeBlock
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public CodeBlock()
  {
    // line 466 "../../../../src/Umple_Code.ump"
    code = new Hashtable<String,String>();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public void delete()
  {}
  
  //------------------------
  // DEVELOPER CODE - PROVIDED AS-IS
  //------------------------
  
  // line 278 ../../../../src/Umple.ump
  public static String languageUsed = "";
  Hashtable<String,String> code;
 public CodeBlock(String add)  {
this();
		code.put("",add);
  }
 public CodeBlock(String lang,String add)  {
this();
		code.put(lang,add);
  }
// line 478 ../../../../src/Umple_Code.ump
  public void setCode(String add)
	{
		if(add!=null)
		  code.put("",add);
		else
		  code.put("","");
	}
	public void setCode(String lang, String add)
	{
		if(add!=null)
		  code.put(lang,add);
		else
		  code.put(lang,"");
	}
	public String getCode()
	{
		return !code.containsKey(languageUsed) ? "".equals(languageUsed) ? null : code.get("") : code.get(languageUsed);
	}
	public String getCode(String lang)
	{
		return code.containsKey(lang)? code.get(lang) : code.get("");
	}
	public String toString()
	{
		Enumeration<String> enumer = code.elements();
		String out = "";
		while(enumer.hasMoreElements())
		{
			out += enumer.nextElement();
		}
		return out;
	}
}