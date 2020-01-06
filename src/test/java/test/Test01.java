package test;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bw.utils.IOUtils;
import com.bw.utils.StringUtil;
import com.cxr.bean.Colum;
import com.cxr.mapper.ColumMapper;

public class Test01 {
	static List<Colum> list=new ArrayList<Colum>();
	public static void main(String[] args) {
		ApplicationContext app=new ClassPathXmlApplicationContext("applicationContext.xml");
		ColumMapper mapper = app.getBean(ColumMapper.class);
		int i=0;
		List<Object[]> readFile = IOUtils.readFile("D:/workspace/1710B_seven/chengxinran-serior1-week02exam/src/test/resources/files/a.txt","\t");
		for (Object[] o : readFile) {
			if(StringUtil.isNumber(o[0]+"")){
				if(!StringUtil.isEmpty(o[3]+"")&&!StringUtil.isEmpty(o[4]+"")&&!StringUtil.isEmpty(o[5]+"")){
					if(!StringUtil.isEmpty(o[6]+"")&&StringUtil.isNumber(o[6]+"")){
						Colum colum=new Colum(Integer.parseInt(o[0]+""), o[1]+"", o[2]+"", o[3]+"", o[4]+"",o[5]+"",Double.parseDouble(o[6]+""),o[7]+"",o[8]+" ",o[9]+"", o[10]+"");
						list.add(colum);
						mapper.addco(colum);
					}
				}
			}
			
			
			
			
			
			
			
		}
		
	}
}
