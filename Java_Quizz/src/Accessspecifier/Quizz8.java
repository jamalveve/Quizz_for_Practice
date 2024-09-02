package Accessspecifier;

 
public class Quizz8
{
    private int methodOne(int i)
    {
        return ++i;//102
    }
     
    public int methodTwo(int i)
    {
        return methodOne(++i);//comes here as 103
    }
}
class childs extends Quizz8{
	@Override
	public int methodTwo(int i) {
		return methodTwo(i++);//oevrideing possible here not for methodOne
	}
}