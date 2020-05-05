public class demo2mang
{
    public static void main(String[] args) {
        int count = 0;
        int[] a = {8,5,6,-1,4,-3};
        for (int array : a)
        {
            if(array > 0)
            {
                count ++;
            }
        }
        int[] tong = new int[a.length];
        int[] mangduong = new int[count];
        int[] mangam = new int[a.length - count];
        int index = 0;
        int index1 = 0;

        for (int array : a) // 8,5,6,-1,4,-3
        {
            if(array > 0)
            {
                for (int i = 0; i < mangduong.length; i++)
                {
                    mangduong[index] = array;
                    break;
                }
                index++;
            }
            else
            {
                for (int i = 0; i < mangam.length; i++)
                {
                    mangam[index1] = array;
                    break;
                }
                index1 ++;
            }
        }

        int index3 = 0;
        for (int arrayDuong : mangduong)
        {
            tong[index3] = arrayDuong;
            index3++;
            System.out.println(index3);
        }
        for (int arrayAm : mangam)
        {
            tong[index3] = arrayAm;
            index3++;
            System.out.println(index3);
        }
        for (int arrayTong : tong)
        {
            System.out.println(arrayTong);
        }

    }
}
