package emailsystem;

import java.util.Map;

import org.mule.api.MuleMessage;
import org.mule.api.transformer.TransformerException;
import org.mule.api.transport.PropertyScope;
import org.mule.transformer.AbstractMessageTransformer;

public class emailHelp extends AbstractMessageTransformer{


	@Override
	public Object transformMessage(MuleMessage message, String outputEncoding) throws TransformerException {
	
		Map<String,String> data=(Map<String,String>) message.getPayload();
		message.setProperty("name",data.get("name"),PropertyScope.SESSION);
		message.setProperty("password",data.get("password"),PropertyScope.SESSION);
		
		System.out.println(data.get("name"));
		System.out.println(data.get("password"));
		
	
	return null;
	}

}
