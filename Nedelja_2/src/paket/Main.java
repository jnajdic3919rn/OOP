package paket;

public class Main {

	public static void main(String[] args) {
		/// konkatenacija stringa sa + ili upotrebom metode concat()

				/// String str1 = "abc";
				/// int broj = 67;
				/// String str2 = "6700";
				/// int broj2 = Integer.parseInt(str2);
				/// System.out.println(str2 + broj2); /// 67006700
				/// str1 = str1 + (broj + broj);
				/// str1 = str1.concat(String.valueOf(broj)); /// abcabc
				/// System.out.println(str1);
				/// Integer.parseInt()
				/// Integer.valueOf()
				
				String str1 = "abc"; /// literal
				String str2 = new String("abc"); /// objekat
				String str3 = "abc";
				String str4 = new String("abc");
				String str5 = "abcd";
				
				/// Poredjenje stringova
				/// poredjenje koriscenjem == (uporedjuje memorijske lokacije)
				/// poredjenje koriscenjem metode .equals() poredi sadrzinu stringa
				
				if(str1 == str2) {
					System.out.println("Stringovi su na istoj lokaciji");
				}
				else
					System.out.println("Stringovi nisu na istoj lokaciji");
				
				if(str1 == str3) {
					System.out.println("Stringovi su na istoj lokaciji");
				}
				else
					System.out.println("Stringovi nisu na istoj lokaciji");
				
				if(str2 == str4) {
					System.out.println("Stringovi su na istoj lokaciji");
				}
				else
					System.out.println("Stringovi nisu na istoj lokaciji");
				
				if(str1 == str5) {
					System.out.println("Stringovi su na istoj lokaciji");
				}
				else
					System.out.println("Stringovi nisu na istoj lokaciji");
				
				if(str1.equals(str5))
					System.out.println("Stringovi su isti");
				else
					System.out.println("Stringovi nisu isti");
				
				if(str1.equals(str2))
					System.out.println("Stringovi su isti");
				else
					System.out.println("Stringovi nisu isti");
				
				StringBuilder sb = new StringBuilder();
				/// Jefimija Najdic 39 2019 RN
				sb.append("Jefimija ");
				sb.append("Najdic ");
				sb.append(39);
				sb.append(" ");
				sb.append(2019);
				sb.append(" RN ");
				String konacno1 = sb.toString();
				System.out.println(konacno1);
				sb.setLength(0);
				sb.append("Mladen ");
				sb.append("Jovanovic ");
				sb.append(39);
				sb.append(" ");
				sb.append(2019);
				sb.append(" RN ");
				String konacno2 = sb.toString();
				System.out.println(konacno2);
				
				String str = "dddd 12 acb 12 b JKL 46 kj c kjl";
				/// splituje po slovima kada ih je od dva do 10
				/// dakle trazimo stringove koji se sastoje od malih i velikih slova kojih je od 2 do 10
				/// u ovom primeru dddd odgovara sablonu - imamo 4 pojavljivanja slova d
				/// takodje acb odgovara sablonu - imamo 3 pojavljivanja slova - jedno a jedno c i jedno b
				/// b s druge strane ne odgovara sablonu
				/// JKL odgovara
				/// kj odgovara
				/// c ne odgovara
				/// kjl odgovara
				String strSplit[] = str.split("[a-zA-Z]{2,10}");
				for(String s:strSplit) {
					System.out.println(s);
				}
				
				String mojMejl = "jnajdic3919rn@raf.rs";
				/// slova 1+ brojevi min 3 max 5 slova 2 @raf.rs
				/// [a-z&&[^y]]+[0-9]{3,5}r[inm]@raf\\.rs
				
				if(mojMejl.matches("[a-z&&[^y]]+[0-9]{3,5}r[inm]?@raf\\.rs"))
					System.out.println("Mejl je validan");
				/// + * ? {2} {2,} {2,6}

	}

}
