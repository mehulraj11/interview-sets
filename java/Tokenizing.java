import java.util.StringTokenizer;
import java.util.StringJoiner;

public class Tokenizing
{
	public static void main(String[] args)
	{
		String s = "raJ    kumAR,   meHUL   sRiVasTava,   RIYA   VerMA";
		StringTokenizer st = new StringTokenizer(s,",");
		StringJoiner joiner = new StringJoiner(" | ", "Names: [", "]");
		while(st.hasMoreTokens())
		{
			String raw = st.nextToken().trim();
			String[] parts = raw.split("\\s+");
			StringBuilder cleaned = new StringBuilder();
			
			for(String p : parts)
			{
				if(p.isEmpty()) continue;
				String first = p.substring(0,1).toUpperCase();
				String rest = p.substring(1).toLowerCase();
				cleaned.append(first).append(rest).append(" ");	
			}
			String finalName = cleaned.toString().trim();
			joiner.add(finalName);
		}
		System.out.println(joiner.toString());
	}
}