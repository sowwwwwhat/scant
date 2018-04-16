package test;

import java.util.Scanner;


public class One {
    public static void main(String[] args)  {
        Scanner in = new Scanner(System.in);
        int a_size = 0;
        a_size = Integer.parseInt(in.nextLine().trim());

        String[] a = new String[a_size];
        for(int i = 0; i < a_size; i++) {
            String a_item;
            try {
                a_item = in.nextLine();
            } catch (Exception e) {
                a_item = null;
            }
            a[i] = a_item;
        }

        int b_size = 0;
        b_size = Integer.parseInt(in.nextLine().trim());

        String[] b = new String[b_size];
        for(int i = 0; i < b_size; i++) {
            String b_item;
            try {
                b_item = in.nextLine();
            } catch (Exception e) {
                b_item = null;
            }
            b[i] = b_item;
        }

        commonSubstring(a, b);
        
    }

	private static void commonSubstring(String[] a, String[] b) {
		// TODO Auto-generated method stub
		for (int i = 0; i < a.length; i++) {
			char[] aarr = a[i].toCharArray();
			char[] barr = b[i].toCharArray();
			boolean flag = false;
			for (int j = 0; j < aarr.length; j++) {
				for (int k = 0; k < barr.length; k++) {
					if (aarr[j] == barr[k]) {
						flag = true;
						System.out.println("YES");
						break;
					}
				}
				if (flag) {
					break;
				}
				if(j==aarr.length-1&&flag ==false) {
					System.out.println("NO");
				}
			}
		}
	}
	}

