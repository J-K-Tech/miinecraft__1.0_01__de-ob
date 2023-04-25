package net.minecraft.src;
import net.jktech.math.Vector3;
public class BlockCloth extends Block {
    public Vector3 color;
    public BlockCloth(int var1, int var2,Material var3, Vector3 var4)
    {
        super(var1,var2,var3);
        this.color=var4;
    }

    public BlockCloth(int var1, int var2,Material var3)
    {
        super(var1,var2,var3);
        this.color=new Vector3(1.0F,1.0F,1.0F, true);
    }
}