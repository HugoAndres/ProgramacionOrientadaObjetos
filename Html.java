//Creacion de pagina HTML por medio de clases.

import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.*;

class head{
	String Title; //				0				1		  2			 3			 4			5
	final String[] head = {"<!DOCTYPE html>\n","<HTML>\n","<Head>\n","</Head>\n","<Title>","</Title>\n"};
	File f;
	BufferedWriter bw;
	

	head(){
			try{
				f= new File("Index1.HTML");
				bw= new BufferedWriter(new FileWriter(f));
				
			//for(int i=0;i<=3;i++){
			//	bw.write(head[i]);
			//}
				Title=("");
			} catch(IOException e){
				e.printStackTrace();
			}	
	}

	head(String Title){
		try{
			f= new File("Index.HTML");
			bw= new BufferedWriter(new FileWriter(f));
			
		//for(int i=0;i<=3;i++){
		//	bw.write(head[i]);
		//}
		this.Title = head[4].concat(Title).concat(head[5]);
		} catch(IOException e){
			e.printStackTrace();
		}	
		
		
	}
	public void cabeza() {
		try{
			
				bw.write(head[0]);
				bw.write(head[1]);
				bw.write(head[2]);
				bw.write(Title);
				bw.write(head[3]);
			} catch(IOException e){
				e.printStackTrace();
			}	
	}
	public void setTitle(String Title){
		this.Title = head[4].concat(Title).concat(head[5]);

	}
}
class header extends head{ //	 0		 1		  2			3		  4		  5			6		  7			  									8																													9
	final String[] header = {"<body>\n","<H1>","</H1>\n","<nav>\n","<ul>\n","<li style= \" color:white; \" >","\n</ul>\n","</nav>","<header style = \" background-image: url('https://www.ciclismoyrendimiento.com/wp-content/uploads/2014/01/ciclismo-y-rendimiento-blog-bg2.jpg') \">","</header>"};
	//final head h1 = new head("generador");
	String Menu1;
	String Menu2;
	String Menu3;
	String Menu4;
	String Menu5;
	String Menu6;
	String Menu7;
	String Menu8;
	String titulo;
	header(){
		//try{
			//super(bw,Title,f);
			Menu1 = ("");
			Menu2 = ("");
			Menu3 = ("");
			Menu4 = ("");
			Menu5 = ("");
			Menu6 = ("");
			Menu7 = ("");
			Menu8 = ("");
			//for(int i=0;i<=3;i++){
			//	bw.write(header[i]);
			//}
			//bw.write(header[7]);
		//	} catch(IOException e){
				//e.printStackTrace();
		//	}	
	}
	header(String Menu1,String Menu2,String Menu3, String Menu4, String Menu5, String Menu6, String Menu7, String Menu8,String titulo){
		//try{
			//super(bw,Title,f);
			//super(Title);
			
			this.Menu1 = header[5].concat(Menu1);
			this.Menu2 = header[5].concat(Menu2);
			this.Menu3 = header[5].concat(Menu3);
			this.Menu3 = header[5].concat(Menu4);
			this.Menu3 = header[5].concat(Menu5);
			this.Menu3 = header[5].concat(Menu6);
			this.Menu3 = header[5].concat(Menu7);
			this.Menu3 = header[5].concat(Menu8);
			this.titulo = header[1].concat(titulo).concat(header[2]);
			//for(int i=0;i<=3;i++){
			//	bw.write(header[i]);
			//}
			//bw.write(header[7]);
		//	} catch(IOException e){
		//		e.printStackTrace();
		//	}
		
		//Menu();
	}
	public void Menu() {
		try{
			bw.write(header[8]);
			bw.write(header[0]);
			bw.write(titulo);
			bw.write(header[4]);
			bw.write(Menu1);
			bw.write(Menu2);
			bw.write(Menu3);
			bw.write(Menu4);
			bw.write(Menu5);
			bw.write(Menu6);
			bw.write(Menu7);
			bw.write(Menu8);
			bw.write(header[6]);
			bw.write(header[7]);
			bw.write(header[9]);
			//bw.close();
			} catch(IOException e){
				e.printStackTrace();
			}	
	}
	public void setMenu(String Menu1,String Menu2,String Menu3, String Menu4, String Menu5, String Menu6, String Menu7, String Menu8,String titulo ){
		this.Menu1 = header[5].concat(Menu1);
		this.Menu2 = header[5].concat(Menu2);
		this.Menu3 = header[5].concat(Menu3);
		this.Menu4 = header[5].concat(Menu4);
		this.Menu5 = header[5].concat(Menu5);
		this.Menu6 = header[5].concat(Menu6);
		this.Menu7 = header[5].concat(Menu7);
		this.Menu8 = header[5].concat(Menu8);
		this.titulo = header[1].concat(titulo).concat(header[2]);
	}
	
}
class body extends header{//		0			  1		   2		   3		4				5			6		7			8			 9
	final String[] bodier = {"\n<img src = \" ","\" style = \" width \">\n  ","<table>\n","<tr>\n","<td>","<td colspan = >","</td>\n","</tr>\n","\n</table>\n","</td>","<a href = \" # \">","</a>","<h4>","</h4>"};
	String img1;
	String img2;
	String img3;
	String img4;
	String img5;
	String img6;
	String tabi;
	String tabii;
	String tabif;
	String tab_;
	String tab_i;
	String tab_f;
	String tabf;
	String tabfi;
	String tabff;
	String row1;
	String row;
	String row2;
	String colmn;
	Integer t1;
	Integer t2;
	String sub1 = "Subtitulo1";
	String sub2 = "Subtitulo2";
	String sub3 = "Subtitulo3";
	String sub4 = "Subtitulo4";
	String sub5 = "Subtitulo5";
	String sub6 = "Subtitulo6";
	String Titulo1 = "Blog de Ciclismo y Entrenamiento";
	body(){
		img1 = " \" \" ";
		tabi = "";
		tabii = "";
		tabif = "";
		tab_ = "";
		tab_i = "";
		tab_f = "";
		tabf = "";
		tabfi = "";
		tabff = "";
		colmn = "";
		t1 = 5; // t>=2
		t2 = 5; // t2>=1
		row1 = "";
		row = "";
		row2 = "";


	}
	body(String img, String tabi, String tabf, String row1, String row,String row2){
		this.row1 = row1;
		this.row = row;
		this.row2 = row2;
		this.img1 = bodier[0].concat(img).concat(bodier[1]);
		this.tabi = bodier[2].concat(bodier[3]).concat(bodier[4]).concat(row1).concat(bodier[9]);
		this.tabii = bodier[4].concat(row1).concat(bodier[9]);
		this.tabif = bodier[4].concat(row1).concat(bodier[6]);
		this.tab_ = bodier[3].concat(bodier[4]).concat(row).concat(bodier[9]);
		this.tab_i = bodier[4].concat(row).concat(bodier[9]);
		this.tab_f = bodier[4].concat(row).concat(bodier[6]);
		this.tabf = bodier[3].concat(bodier[4]).concat(row2).concat(bodier[9]);
		this.tabfi = bodier[4].concat(row2).concat(bodier[9]);
		this.tabff = bodier[4].concat(row2).concat(bodier[6]).concat(bodier[7]).concat(bodier[8]);
	}
	public void bodier(Integer t1, Integer t2){
		try{
			bw.write(Titulo1);
			bw.write(img1);
			bw.write(sub1);
			bw.write(img2);
			bw.write(sub2);
			bw.write(img3);
			bw.write(sub3);
			bw.write(img4);
			bw.write(sub4);
			bw.write(img5);
			bw.write(sub5);
			bw.write(img6);
			bw.write(sub6);
			//bw.write(tabi);
			//bw.write(tabf);
		} catch(IOException e){
			e.printStackTrace();
		}
	}
	public void check_row1(Integer t2){
		try{
			if(t2==1){
				bw.write("\n");
			} else if(t2==2){
				bw.write(tabif);
			} else if(t2>1){
				for(int i=1;i<=t2;i++){
					bw.write(tabii);
				}
				bw.write(tabif);
			}
		} catch(IOException e){
			e.printStackTrace();
		}
	}
	public void check_row2(Integer t2){
		try{
			if(t2==1){
				bw.write("\n");
			} else if(t2==2){
				bw.write(tab_f);
			} else if(t2>1){
				for(int i=1;i<=t2;i++){
					bw.write(tab_i);
				}
				bw.write(tab_f);
			}
		} catch(IOException e){
			e.printStackTrace();
		}
	}
	public void check_row3(Integer t2){
		try{
			if(t2==1){
				bw.write("\n");
			} else if(t2==2){
				bw.write(tabff);
			} else if(t2>1){
				for(int i=1;i<=t2;i++){
					bw.write(tabfi);
				}
				bw.write(tabff);
			}
		} catch(IOException e){
			e.printStackTrace();
		}
	}
	/*public void line_c(Integer t){
		for(int i=1;i<=t;i++){
			try{
			bw.write(tabi);
			} catch(IOException e){
			e.printStackTrace();
			}
		}
	}*/
	public void setImg(String img1,String img2,String img3,String img4,String img5,String img6){
		this.Titulo1 = header[1].concat(Titulo1).concat(header[2]);
		this.img1 = bodier[10].concat(bodier[0]).concat(img1).concat(bodier[1]).concat(bodier[11]);
		this.img2 = bodier[10].concat(bodier[0]).concat(img2).concat(bodier[1]).concat(bodier[11]);
		this.img3 = bodier[10].concat(bodier[0]).concat(img3).concat(bodier[1]).concat(bodier[11]);
		this.img4 = bodier[10].concat(bodier[0]).concat(img4).concat(bodier[1]).concat(bodier[11]);
		this.img5 = bodier[10].concat(bodier[0]).concat(img5).concat(bodier[1]).concat(bodier[11]);
		this.img6 = bodier[10].concat(bodier[0]).concat(img6).concat(bodier[1]).concat(bodier[11]);
		this.sub1 = bodier[12].concat(sub1).concat(bodier[13]);
		this.sub2 = bodier[12].concat(sub2).concat(bodier[13]);
		this.sub3 = bodier[12].concat(sub3).concat(bodier[13]);
		this.sub4 = bodier[12].concat(sub4).concat(bodier[13]);
		this.sub5 = bodier[12].concat(sub5).concat(bodier[13]);
		this.sub6 = bodier[12].concat(sub6).concat(bodier[13]);
		//this.Menu2 = header[5].concat(Menu2);
		//this.Menu3 = header[5].concat(Menu3);
	}
	public void setRow(String row1, String row, String row2){
		this.row1 = row1;
		this.row = row;
		this.row2 = row2;
		this.tabi = bodier[2].concat(bodier[3]).concat(bodier[4]).concat(row1).concat(bodier[9]);
		this.tabii = bodier[4].concat(row1).concat(bodier[9]);
		this.tabif = bodier[4].concat(row1).concat(bodier[6]);
		this.tab_ = bodier[3].concat(bodier[4]).concat(row).concat(bodier[9]);
		this.tab_i = bodier[4].concat(row).concat(bodier[9]);
		this.tab_f = bodier[4].concat(row).concat(bodier[6]);
		this.tabf = bodier[3].concat(bodier[4]).concat(row2).concat(bodier[9]);
		this.tabfi = bodier[4].concat(row2).concat(bodier[9]);
		this.tabff = bodier[4].concat(row2).concat(bodier[6]).concat(bodier[7]).concat(bodier[8]);
	}
}
class footer extends body{
	final String[] footer = {"<footer style= \" background-color: gray \">\n","<p>","</p>\n","</footer>\n","</body>\n","\n</html>"};
	//final head h1 = new head("generador");
	//final header h2 = new header("menu 1","menu 2","menu 3");
	
	String fecha;
	String copyright;
	footer(){
		//try{
			fecha ="";
			copyright="";
		//} catch(IOException e){
		//	e.printStackTrace();
		//}
	}
	footer(String fecha, String copyright){
		this.fecha = footer[1].concat(fecha).concat(footer[2]);
		this.copyright = footer[1].concat(copyright).concat(footer[2]);
		
	}
	public void Feet(){
		try{
			
			bw.write(footer[0]);
			bw.write(fecha);
			bw.write(copyright);
			bw.write(footer[3]);
			bw.write(footer[4]);
			bw.write(footer[5]);
			bw.close();
		} catch(IOException e){
			e.printStackTrace();
		}
	}
	public void Setfecha(String fecha) {
		this.fecha = footer[1].concat(fecha).concat(footer[2]);

	}
	public void SetCopy(String copyright) {
		this.copyright = footer[1].concat(copyright).concat(footer[2]);

	}
}
public class Html{
	public static void main(String[] arg){
		//header h1 = new header("menu1","menu 2", "menu2");
		//h1.cabeza();
		//h1.setTitle("lol");
		//h1.cabeza();
		//h1.Menu();
		
		footer f1 = new footer("19/11/2019","&copy; 2015 RapidTables.com");
		f1.setTitle("lol");
		f1.cabeza();
		f1.setMenu("ENTRENAMIENTO","BIOMECANICA", "AERODINAMICA", "FORMACION", "BLOG", "NOSOTROS", "RESERVAS","CONTACTO","ciclismoyrendimiento.com");
		f1.Menu();
		f1.setImg("https://www.ciclismoyrendimiento.com/wp-content/uploads/2019/11/GManera_TrainingPeaks_116-1024x682.jpg","https://www.ciclismoyrendimiento.com/wp-content/uploads/2019/11/GManera_TrainingPeaks_116-1024x682.jpg","https://www.ciclismoyrendimiento.com/wp-content/uploads/2019/11/GManera_TrainingPeaks_116-1024x682.jpg","https://www.ciclismoyrendimiento.com/wp-content/uploads/2019/11/GManera_TrainingPeaks_116-1024x682.jpg","https://www.ciclismoyrendimiento.com/wp-content/uploads/2019/11/GManera_TrainingPeaks_116-1024x682.jpg","https://www.ciclismoyrendimiento.com/wp-content/uploads/2019/11/GManera_TrainingPeaks_116-1024x682.jpg");
		f1.setRow("row1", "row", "row2");
		f1.bodier(5, 5);
		f1.Feet();
	}
}