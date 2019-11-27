package wwcp.entities.locomotives.electrics;//This is a documentation class for copy pasting into an electric train class.


import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import ebf.tim.TrainsInMotion;
import ebf.tim.api.SkinRegistry;
import ebf.tim.entities.EntityTrainCore;
import ebf.tim.items.ItemTransport;
import ebf.tim.registry.URIRegistry;
import ebf.tim.utility.DebugUtil;
import ebf.tim.utility.RailUtility;
import fexcraft.tmt.slim.ModelBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import wwcp.entities.SuperStat;
import wwcp.models.bogies.flexxpower;
import wwcp.models.locomotives.F140MS2;
import wwcp.worldwidecontentpack;
import java.util.UUID;
import net.minecraft.init.Items;


// XXXX
// YYYY
// ZZZZ
// QQQQ

public class EntityRE484 extends EntityTrainCore {

    public static final Item thisItem = new ItemTransport(new wwcp.entities.locomotives.electrics.EntityRE484(null), worldwidecontentpack.MODID,worldwidecontentpack.European);

    /**
     * these basic constructors only need to have their names changed to that of this class, that is assuming your editor doesn't automatically do that.
     * Be sure the one that takes more than a world is always first, unless you wanna compensate for that in the item declaration.
     * @see EntityTrainCore
     */
    public EntityRE484(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }
    public EntityRE484(World world){
        super(world);
    }

    @Override
    public String transportName() { return SuperStat.SBBRE484().name; }

    @Override
    public String transportcountry() { return SuperStat.SBBRE484().country; }

    @Override
    public String transportYear() { return SuperStat.SBBRE484().year; }

    @Override
    public String transportFuelType() {
        return SuperStat.SBBRE484().fuel;
    }
    @Override
    public boolean isFictional() {
        return SuperStat.SBBRE484().fictional;
    }
    @Override
    public float transportTractiveEffort() {
        return SuperStat.SBBRE484().tractive_effort;
    }
    @Override
    public float transportMetricHorsePower() {
        return SuperStat.SBBRE484().metric_horsepower;
    }
    @Override
    public float weightKg() {
        return  SuperStat.SBBRE484().weightinKGs;
    }

    public boolean isReinforced() {
        return SuperStat.SBBRE484().reinforced;
    }

    @Override
    public String[] additionalItemText() {
        {return new String[]{RailUtility.translate(SuperStat.SBBRE484().additionalTextTitle) + SuperStat.SBBRE484().additionalText,
                RailUtility.translate(SuperStat.SBBRE484().additionalTextTitle2) + SuperStat.SBBRE484().additionalText2};}
    }

    @Override
    public float transportTopSpeed(){return accelerator<0?SuperStat.SBBRE484().backTopSpeed:SuperStat.SBBRE484().topSpeed;}

    @Override
    public void registerSkins(){
        SkinRegistry.addSkin(this.getClass(),worldwidecontentpack.MODID, "textures/locomotive/Electric/F140MS2/T1.png", "textures/bogies/Flexxpower.png","Belgian Theme Skin", "Used by the NMBS/SNCB in belgium for freight trains");
        SkinRegistry.addSkin(this.getClass(),worldwidecontentpack.MODID, "textures/locomotive/Electric/F140MS2/T2.png", "textures/bogies/Flexxpower.png","NS Livery", "Used by the NS in their regular service");
        SkinRegistry.addSkin(this.getClass(),worldwidecontentpack.MODID, "textures/locomotive/Electric/F140MS2/T3.png", "textures/bogies/Flexxpower.png", "Polish Theme Skin", "Used by the NMBS/SNCB in belgium for freight trains");
        SkinRegistry.addSkin(this.getClass(),worldwidecontentpack.MODID, "textures/locomotive/Electric/F140MS2/T4.png", "textures/bogies/Flexxpower.png","Easter Theme Skin", "Used by the NMBS/SNCB in belgium for freight trains");
        SkinRegistry.addSkin(this.getClass(),worldwidecontentpack.MODID, "textures/locomotive/Electric/F140MS2/T5.png", "textures/bogies/Flexxpower.png","Silesian Theme Skin", "Used by the NMBS/SNCB in belgium for freight trains");
        SkinRegistry.addSkin(this.getClass(),worldwidecontentpack.MODID, "textures/locomotive/Electric/F140MS2/T6.png", "textures/bogies/Flexxpower.png", "HLE28 NMBS Cargo", "Used by the NMBS/SNCB in belgium for freight trains");
        SkinRegistry.addSkin(this.getClass(),worldwidecontentpack.MODID, "textures/locomotive/Electric/F140MS2/T7.png", "textures/bogies/Flexxpower.png","Valentines Day Theme Skin", "Used by the NMBS/SNCB in belgium for freight trains");
        SkinRegistry.addSkin(this.getClass(),worldwidecontentpack.MODID, "textures/locomotive/Electric/F140MS2/T8.png", "textures/bogies/Flexxpower.png","WWCP Commercial Livery", "Used by the NMBS/SNCB in belgium for freight trains");
        SkinRegistry.addSkin(this.getClass(),worldwidecontentpack.MODID, "textures/locomotive/Electric/F140MS2/T9.png", "textures/bogies/Flexxpower.png","StPatricks Day Theme Skin", "Used by the NMBS/SNCB in belgium for freight trains");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/locomotive/Electric/F140MS2/T10.png", "textures/bogies/Flexxpower.png", "Halloween Theme Skin", "Used by the NMBS/SNCB in belgium for freight trains");
    }
    @Override
    public float getMaxFuel(){return 20;}

    @SideOnly(Side.CLIENT)
    public int[] getParticleData(int id) {
        DebugUtil.println(id);
        switch (id) {
            case 0: {
                return new int[]{3, 100, 0x232323};//smoke
            }
            case 1: {
                return new int[]{5, 100, 0x232323};//heavy smoke
            }
            case 2: {
                return new int[]{2, 100, 0xEEEEEE};//steam
            }
            case 3: {
                return new int[]{6, 100, 0xCECDCB};//led lamp
            }
            case 4: {
                return new int[]{4, 50, 0xCC0000};//reverse lamp
            }
            case 5: {
                return new int[]{1, 50, 0xCC0000};//small sphere lamp
            }
            default: {
                return new int[]{6, 100, 0xCCCC00};//lamp
            }
        }
    }

//    @Override
    public TrainsInMotion.transportTypes getType() {return TrainsInMotion.transportTypes.ELECTRIC; }

    @Override
    public float[][] getRiderOffsets(){return new float[][]{{-3.82f,1.4f, -0.25f}};}

    @Override
    public float[] getHitboxSize() {
        return new float[]{9.5f,2.5f,1.5f};
    }

    public ItemStack[] getRecipie() {
        return new ItemStack[]{
                null, null, null,
                null, null, null,
                null, null, null
        };
    }

    /**
     * <h2>Hitbox offsets</h2>
     * @return defines the positions for the hitboxes in blocks. 0 being the center, negative values being towards the front. the first and last values define the positions of the couplers
     */

    @Override
    public float[][] bogieModelOffsets(){return new float[][]{{2.5f,0.05f,0},{-2.5f,0.05f,0}};
    }
    @Override
    public ModelBase[] bogieModels() {return new ModelBase[]{new flexxpower()}; }

    @Override
    public float[] bogieLengthFromCenter() {
        return new float[]{2, -2};
    }

    @Override
    public float getRenderScale() {
        return  0.0625f;
    }

    @Override
    public float[][] modelOffsets() {
        return new float[][]{{0f,-0.05F,0.F}};}

    /**
     * <h2>rider sit or stand</h2>
     * @return true if the rider(s) should be sitting, false if the rider should be standing.
     */
    @Override
    public boolean shouldRiderSit(){
        return true;
    }
    /**
     * <h2>reinforced transport</h2>
     * this returns if this specific entity is reinforced (explosion proof and damage resistant).
     * since this is a function it can b
     * te conditional as well, for instance if it has a specific skin.
     */

    /**
     * <h2>Fluid Tank Capacity</h2>
     */
    //@Override
    public int[] getTankCapacity(){return new int[]{9161, 800};}

    @Override
    public boolean isItemValidForSlot(int slot, ItemStack stack){
        switch (slot){
            case 400:{return stack!=null && stack.getItem() ==Items.redstone;}
            default:{return true;}
        }}

    /**
     * <h2>fuel management</h2>
     * defines how the transport manages burnHeat, both in consuming items, and in managing the burnHeat.
     */

    public void manageFuel() {
        this.fuelHandler.manageElectric(this);
    }

    /**
     * <h2>pre-assigned values</h2>
     * These return values are defined from the top of the class.
     * These should only need modification for advanced users, and even that's a stretch.
     */
    public Item getItem(){
        return thisItem;
    }

    public ModelBase[] getModel(){return new ModelBase[]{new F140MS2()};}

    /**
     * <h2>sets the resource location for sounds, like horn and the sound made for the engine running</h2>
     */
    @SideOnly(Side.CLIENT)
    @Override
    public ResourceLocation getHorn(){return URIRegistry.SOUND_HORN.getResource("xxxxxxx.ogg");}
    @SideOnly(Side.CLIENT)
    @Override
    public ResourceLocation getRunningSound(){return URIRegistry.SOUND_RUNNING.getResource("xxxxxxx.ogg");}
}

