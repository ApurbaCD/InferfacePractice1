public class Ca {
        public  static double Max(Measurable[] obj)
        {
            int i=0;
            double  value=0 ;
            String b="";
            //System.out.println("Obj: " + objects.length);
            for( i=0;i<obj.length;i++)
            {
                if(obj[i].getMeasure()>value)
                {
                    value = obj[i].getMeasure();
                    b=obj[i].getMeasure2();

                }
            }
            System.out.println(b);
            return value;


        }
        public  static double avarage (Measurable[] obj)
        {
            double sum =0.0 ;
            for(int i=0;i< obj.length;i++)
            {
                sum = sum+obj[i].getMeasure();
            }
          return sum/ obj.length;


        }
    }

