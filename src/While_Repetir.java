public class While_Repetir
{
    public static void main(String[] args)
    {
        int jira = 11;
        while (jira >= 2) {
            jira--;
            if (jira >1) {
        }
            if (jira >=3)
            {
                System.out.println(jira + " patinhos foram passear\n" +
                        "Além das montanhas\n" +
                        "Para brincar\n" +
                        "A mamãe gritou: Quá, quá, quá, Mas só " + (jira - 1) + " patinhos voltaram de lá.\n");
            }else
            {
                System.out.println(jira + " patinho foi passear\n" +
                        "Além das montanhas\n" +
                        "Para brincar\n" +
                        "A mamãe gritou: Quá, quá, quá, Mas só " + (jira - 1) + " patinho voltou de lá.\n");
            }


        }
    }
}
