package mods.smitecraft.common;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityEggInfo;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.EnumHelper;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = "smitecraft", name = "Smite Craft", version = "0.0.1")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)

public class smitecraft {

	@SidedProxy(clientSide = "mods.smitecraft.client.ClientProxy", serverSide = "mods.smitecraft.common.ServerProxy")
	public static ServerProxy proxy;

	//Tool Levels
	public static EnumToolMaterial SILVERT = EnumHelper.addToolMaterial("SILVERT", 2, 275, 7.0F, 3, 10);
	public static EnumToolMaterial SILVERS = EnumHelper.addToolMaterial("SILVERS", 2, 245, 7.0F, 6, 10);
	public static EnumToolMaterial SILVERD = EnumHelper.addToolMaterial("SILVERD", 2, 145, 7.0F, 7, 10);
	public static EnumToolMaterial SILVERH = EnumHelper.addToolMaterial("SILVERH", 2, 250, 7.0F, 4, 10);
	public static EnumArmorMaterial SILVERA = EnumHelper.addArmorMaterial("SILVER_ARMOUR", 23, new int[]{2, 6, 5, 2} ,10);
	public static EnumToolMaterial DIAMOND = EnumHelper.addToolMaterial("DIAMOND", 2, 400, 4.0F, 7, 10);
	public static EnumToolMaterial GOLD = EnumHelper.addToolMaterial("GOLD", 2, 20, 7.0F, 2, 10);
	public static EnumToolMaterial IRON = EnumHelper.addToolMaterial("IRON", 2, 100, 7.0F, 2, 10);
	public static EnumToolMaterial STONE = EnumHelper.addToolMaterial("STONE", 2, 150, 7.0F, 3, 10);
	public static EnumToolMaterial WOOD = EnumHelper.addToolMaterial("WOOD", 2, 50, 7.0F, 1, 10);
	public static EnumToolMaterial COPPERT = EnumHelper.addToolMaterial("COPPERT", 2, 150, 7.0F, 2, 10);
	public static EnumToolMaterial COPPERS = EnumHelper.addToolMaterial("COPPERS", 2, 135, 7.0F, 4, 10);
	public static EnumToolMaterial COPPERD = EnumHelper.addToolMaterial("COPPERD", 2, 40, 7.0F, 3, 10);
	public static EnumToolMaterial COPPERH = EnumHelper.addToolMaterial("COPPERH", 2, 145, 7.0F, 4, 10);
	public static EnumArmorMaterial COPPERA = EnumHelper.addArmorMaterial("COPPER_ARMOUR", 23, new int[]{2, 5, 4, 2} ,10);
	public static EnumToolMaterial TINT = EnumHelper.addToolMaterial("TINT", 2, 150, 7.0F, 2, 10);
	public static EnumToolMaterial TINS = EnumHelper.addToolMaterial("TINS", 2, 135, 7.0F, 4, 10);
	public static EnumToolMaterial TIND = EnumHelper.addToolMaterial("TIND", 2, 40, 7.0F, 3, 10);
	public static EnumToolMaterial TINH = EnumHelper.addToolMaterial("TINH", 2, 145, 7.0F, 4, 10);
	public static EnumArmorMaterial TINA = EnumHelper.addArmorMaterial("TIN_ARMOUR", 23, new int[]{2, 5, 4, 2} ,10);


	//Creative Tab
	public static CreativeTabs tabSmiteCraft = new CreativeTabSmite("SmiteCraft");

	//Blocks
	public static Block SmiteBlock;
	public static Block SilverOre;
	public static Block CopperOre;
	public static Block TinOre;
	public static Block LeadOre;
	public static Block ZincOre;
	public static Block MercuryOre;
	public static Block ArsenicOre;
	public static Block AntimonyOre;
	public static Block SilverBlock;
	public static Block CopperBlock;
	public static Block TinBlock;
	public static Block LeadBlock;
	public static Block ZincBlock;
	public static Block MercuryBlock;
	public static Block ArsenicBlock;
	public static Block AntimonyBlock;

	//Liquids
	public static Block TestStill;

	//Items
	public static Item TestItem;
	public static Item SilverIngot;
	public static Item CopperIngot;
	public static Item TinIngot;
	public static Item LeadIngot;
	public static Item ZincIngot;
	public static Item MercuryIngot;
	public static Item ArsenicIngot;
	public static Item AntimonyIngot;
	public static Item SilverPickaxe;
	public static Item SilverShovel;
	public static Item SilverAxe;
	public static Item SilverSword;
	public static Item SilverHoe;
	public static Item SilverHammer;
	public static Item SilverDagger;
	public static Item CopperPickaxe;
	public static Item CopperShovel;
	public static Item CopperAxe;
	public static Item CopperSword;
	public static Item CopperHoe;
	public static Item CopperHammer;
	public static Item CopperDagger;
	public static Item TinPickaxe;
	public static Item TinShovel;
	public static Item TinAxe;
	public static Item TinSword;
	public static Item TinHoe;
	public static Item TinHammer;
	public static Item TinDagger;
	public static Item TinBow;
	public static Item LeadPickaxe;
	public static Item LeadShovel;
	public static Item LeadAxe;
	public static Item LeadSword;
	public static Item LeadHoe;
	public static Item LeadHammer;
	public static Item LeadDagger;
	public static Item DiamondDagger;
	public static Item IronDagger;
	public static Item GoldDagger;
	public static Item WoodDagger;
	public static Item StoneDagger;
	public static Item ZincPickaxe;
	public static Item ZincShovel;
	public static Item ZincAxe;
	public static Item ZincSword;
	public static Item ZincHoe;
	public static Item ZincHammer;
	public static Item ZincDagger;
	public static Item MercuryPickaxe;
	public static Item MercuryShovel;
	public static Item MercuryAxe;
	public static Item MercurySword;
	public static Item MercuryHoe;
	public static Item MercuryHammer;
	public static Item MercuryDagger;
	public static Item ArsenicPickaxe;
	public static Item ArsenicShovel;
	public static Item ArsenicAxe;
	public static Item ArsenicSword;
	public static Item ArsenicHoe;
	public static Item ArsenicHammer;
	public static Item ArsenicDagger;
	public static Item AntimonyPickaxe;
	public static Item AntimonyShovel;
	public static Item AntimonyAxe;
	public static Item AntimonySword;
	public static Item AntimonyHoe;
	public static Item AntimonyHammer;
	public static Item AntimonyDagger;
	public static Item SilverHelmet;
	public static Item SilverPlate;
	public static Item SilverLegs;
	public static Item SilverBoots;
	public static Item CopperHelmet;
	public static Item CopperPlate;
	public static Item CopperLegs;
	public static Item CopperBoots;
	public static Item SilverBow;
	public static Item CopperBow;
	public static Item TinHelmet;
	public static Item TinPlate;
	public static Item TinLegs;
	public static Item TinBoots;


	//Block ID's
	int SmiteBlockID;
	int SilverOreID;
	int CopperOreID;
	int TinOreID;
	int LeadOreID;
	int ZincOreID;
	int MercuryOreID;
	int ArsenicOreID;
	int AntimonyOreID;
	int SilverBlockID;
	int CopperBlockID;
	int TinBlockID;
	int LeadBlockID;
	int ZincBlockID;
	int MercuryBlockID;
	int ArsenicBlockID;
	int AntimonyBlockID;

	//Item ID's
	int SilverIngotID;
	int CopperIngotID;
	int TinIngotID;
	int LeadIngotID;
	int ZincIngotID;
	int MercuryIngotID;
	int ArsenicIngoteID;
	int AntimonyIngotID;
	int SilverPickaxeID;
	int SilverShovelID;
	int SilverAxeID;
	int SilverSwordID;
	int SilverHoeID;
	int SilverHammerID;
	int CopperPickaxeID;
	int CopperShovelID;
	int CopperAxeID;
	int CopperSwordID;
	int CopperHoeID;
	int CopperHammerID;
	int CopperDaggerID;
	int CopperBowID;
	int TinPickaxeID;
	int TinShovelID;
	int TinAxeID;
	int TinSwordID;
	int TinHoeID;
	int TinHammerID;
	int TinDaggerID;
	int TinBowID;
	int SilverHelmetID;
	int SilverPlateID;
	int SilverLegsID;
	int SilverBootsID;
	int SilverDaggerID;
	int SilverBowID;
	int WoodDaggerID;
	int StoneDaggerID;
	int IronDaggerID;
	int GoldDaggerID;
	int DiamondDaggerID;
	int CopperHelmetID;
	int CopperPlateID;
	int CopperLegsID;
	int CopperBootsID;
	int TinHelmetID;
	int TinPlateID;
	int TinLegsID;
	int TinBootsID;




	@PreInit
	public void preInit(FMLPreInitializationEvent event){
		//Config	
		Configuration config = new Configuration(event.getSuggestedConfigurationFile());

		//Blocks
		SmiteBlockID = config.get("Block IDs", "Smite Block ID", 1949).getInt();
		SilverOreID = config.get("Block IDs", "Silver Ore ID", 1950).getInt();
		CopperOreID = config.get("Block IDs", "Copper Ore ID", 1951).getInt();
		TinOreID = config.get("Block IDs", "Tin Ore ID", 1952).getInt();
		LeadOreID = config.get("Block IDs", "Lead Ore ID", 1953).getInt();
		ZincOreID = config.get("Block IDs", "Zinc Ore ID", 1954).getInt();
		MercuryOreID = config.get("Block IDs", "Mercury Ore ID", 1955).getInt();
		AntimonyOreID = config.get("Block IDs", "Antimonoy Ore ID", 1956).getInt();
		SilverBlockID = config.get("Block IDs", "Silver Block ID", 1957).getInt();
		CopperBlockID = config.get("Block IDs", "Copper Block ID", 1958).getInt();
		TinBlockID = config.get("Block IDs", "Tin Block ID", 1959).getInt();
		LeadBlockID = config.get("Block IDs", "Lead Block ID", 1960).getInt();
		ZincBlockID = config.get("Block IDs", "Zinc Block ID", 1961).getInt();
		MercuryBlockID = config.get("Block IDs", "Mercury Block ID", 1962).getInt();
		ArsenicBlockID = config.get("Block IDs", "Arsenic Block ID", 1963).getInt();
		AntimonyBlockID = config.get("Block IDs", "Antimonoy Block ID", 1964).getInt();


		//Item ID's
		SilverHelmetID = config.get("Item IDs", "Silver Helmet ID", 1965).getInt();
		SilverPlateID = config.get("Item IDs", "Silver Chestplate ID", 1966).getInt();
		SilverLegsID = config.get("Item IDs", "Silver Leggings ID", 1967).getInt();
		SilverBootsID = config.get("Item IDs", "Silver Boots ID", 1968).getInt();
		SilverPickaxeID = config.get("Item IDs", "Silver Pickaxe ID", 1969).getInt();
		SilverShovelID = config.get("Item IDs", "Silver Shovel ID", 1970).getInt();
		SilverAxeID = config.get("Item IDs", "Silver Axe ID", 1971).getInt();
		SilverSwordID = config.get("Item IDs", "Silver Sword ID", 1972).getInt();
		SilverHoeID = config.get("Item IDs", "Silver Hoe ID", 1973).getInt();
		SilverHammerID = config.get("Item IDs", "Silver Hammer ID", 1974).getInt();
		SilverDaggerID = config.get("Item IDs", "Silver Dagger ID", 1975).getInt();
		SilverBowID = config.get("Item IDs", "Silver Bow ID", 1976).getInt();
		WoodDaggerID = config.get("Item IDs", "Wood Dagger ID", 1977).getInt();
		StoneDaggerID = config.get("Item IDs", "Stone Dagger ID", 1978).getInt();
		IronDaggerID = config.get("Item IDs", "Iron Dagger ID", 1979).getInt();
		GoldDaggerID = config.get("Item IDs", "Gold Dagger ID", 1980).getInt();
		DiamondDaggerID = config.get("Item IDs", "Diamond Dagger ID", 1981).getInt();
		CopperPickaxeID = config.get("Item IDs", "Copper Pickaxe ID", 1982).getInt();
		CopperShovelID = config.get("Item IDs", "Copper Shovel ID", 1983).getInt();
		CopperAxeID = config.get("Item IDs", "Copper Axe ID", 1984).getInt();
		CopperSwordID = config.get("Item IDs", "Copper Sword ID", 1985).getInt();
		CopperHoeID = config.get("Item IDs", "Copper Hoe ID", 1986).getInt();
		CopperHammerID = config.get("Item IDs", "Copper Hammer ID", 1987).getInt();
		CopperDaggerID = config.get("Item IDs", "Copper Dagger ID", 1988).getInt();
		CopperBowID = config.get("Item IDs", "Copper Bow ID", 1989).getInt();
		CopperHelmetID = config.get("Item IDs", "Copper Helmet ID", 1990).getInt();
		CopperPlateID = config.get("Item IDs", "Copper Chestplate ID", 1991).getInt();
		CopperLegsID = config.get("Item IDs", "Copper Pants ID", 1992).getInt();
		CopperBootsID = config.get("Item IDs", "Copper Boots ID", 1993).getInt();
		TinPickaxeID = config.get("Item IDs", "Tin Pickaxe ID", 1994).getInt();
		TinShovelID = config.get("Item IDs", "Tin Shovel ID", 1995).getInt();
		TinAxeID = config.get("Item IDs", "Tin Axe ID", 1996).getInt();
		TinSwordID = config.get("Item IDs", "Tin Sword ID", 1997).getInt();
		TinHoeID = config.get("Item IDs", "Tin Hoe ID", 1998).getInt();
		TinHammerID = config.get("Item IDs", "Tin Hammer ID", 1999).getInt();
		TinDaggerID = config.get("Item IDs", "Tin Dagger ID", 2000).getInt();
		TinBowID = config.get("Item IDs", "Tin Bow ID", 2001).getInt();
		TinHelmetID = config.get("Item IDs", "Tin Helmet ID", 2002).getInt();
		TinPlateID = config.get("Item IDs", "Tin Chestplate ID", 2003).getInt();
		TinLegsID = config.get("Item IDs", "Tin Pants ID", 2004).getInt();
		TinBootsID = config.get("Item IDs", "Tin Boots ID", 2005).getInt();


		config.save();

	}

	@Init
	public void load(FMLInitializationEvent Event) {
		proxy.registerRenderThings();
		proxy.registerServerTickHandler();

		//Blocks
		SmiteBlock = new NewBlock(450).setHardness(1.5F).setResistance(10.0F).setUnlocalizedName("Test Block");
		SilverOre = new SilverOre(SilverOreID).setHardness(1.5F).setResistance(10.0F).setUnlocalizedName("smitecraft:silverOre");
		CopperOre = new CopperOre(CopperOreID).setHardness(1.5F).setResistance(10.0F).setUnlocalizedName("smitecraft:copperOre");
		TinOre = new TinOre(TinOreID).setHardness(1.5F).setResistance(10.0F).setUnlocalizedName("smitecraft:tinOre");
		LeadOre = new LeadOre(LeadOreID).setHardness(1.5F).setResistance(10.0F).setUnlocalizedName("smitecraft:leadOre");
		ZincOre = new ZincOre(ZincOreID).setHardness(1.5F).setResistance(10.0F).setUnlocalizedName("smitecraft:zincOre");
		MercuryOre = new MercuryOre(MercuryOreID).setHardness(1.5F).setResistance(10.0F).setUnlocalizedName("smitecraft:mercuryOre");
		ArsenicOre = new ArsenicOre(ArsenicOreID).setHardness(1.5F).setResistance(10.0F).setUnlocalizedName("smitecraft:arsenicOre");
		AntimonyOre = new AntimonyOre(AntimonyOreID).setHardness(1.5F).setResistance(10.0F).setUnlocalizedName("smitecraft:antimonyOre");
		SilverBlock = new SilverBlock(SilverBlockID).setHardness(1.5F).setResistance(10.0F).setUnlocalizedName("smitecraft:silverBlock");
		CopperBlock = new CopperBlock(CopperBlockID).setHardness(1.5F).setResistance(10.0F).setUnlocalizedName("smitecraft:copperBlock");
		TinBlock = new TinBlock(TinBlockID).setHardness(1.5F).setResistance(10.0F).setUnlocalizedName("smitecraft:tinBlock");
		LeadBlock = new LeadBlock(LeadBlockID).setHardness(1.5F).setResistance(10.0F).setUnlocalizedName("smitecraft:leadBlock");
		ZincBlock = new ZincBlock(ZincBlockID).setHardness(1.5F).setResistance(10.0F).setUnlocalizedName("smitecraft:zincBlock");
		MercuryBlock = new MercuryBlock(MercuryBlockID).setHardness(1.5F).setResistance(10.0F).setUnlocalizedName("smitecraft:mercuryBlock");
		ArsenicBlock = new ArsenicBlock(ArsenicBlockID).setHardness(1.5F).setResistance(10.0F).setUnlocalizedName("smitecraft:arsenicBlock");
		AntimonyBlock = new AntimonyBlock(AntimonyBlockID).setHardness(1.5F).setResistance(10.0F).setUnlocalizedName("smitecraft:antimonyBlock");


		//Items
		TestItem = new TestItem(451).setUnlocalizedName("Test Item");
		SilverIngot = new SilverIngot(460).setUnlocalizedName("smitecraft:silverIngot");
		CopperIngot = new CopperIngot(461).setUnlocalizedName("smitecraft:copperIngot");
		TinIngot = new TinIngot(462).setUnlocalizedName("smitecraft:tinIngot");
		LeadIngot = new LeadIngot(463).setUnlocalizedName("smitecraft:leadIngot");
		ZincIngot = new ZincIngot(464).setUnlocalizedName("smitecraft:zincIngot");
		MercuryIngot = new MercuryIngot(465).setUnlocalizedName("smitecraft:mercuryIngot");
		ArsenicIngot = new ArsenicIngot(466).setUnlocalizedName("smitecraft:arsenicIngot");
		AntimonyIngot = new AntimonyIngot(467).setUnlocalizedName("smitecraft:antimonyIngot");
		SilverHelmet = new SilverArmor(SilverHelmetID, SILVERA, proxy.addArmor("Silver"), 0).setUnlocalizedName("smitecraft:SilverHelmet");
		SilverPlate = new SilverArmor(SilverPlateID, SILVERA, proxy.addArmor("Silver"), 1).setUnlocalizedName("smitecraft:SilverPlate");
		SilverLegs = new SilverArmor(SilverLegsID, SILVERA, proxy.addArmor("Silver"), 2).setUnlocalizedName("smitecraft:SilverLegs");
		SilverBoots = new SilverArmor(SilverBootsID, SILVERA, proxy.addArmor("Silver"), 3).setUnlocalizedName("smitecraft:SilverBoots");
		SilverPickaxe = new SilverPickaxe(SilverPickaxeID, SILVERT).setUnlocalizedName("smitecraft:silverPickaxe");
		SilverSword = new SilverSword(SilverSwordID, SILVERS).setUnlocalizedName("smitecraft:silverSword");
		SilverAxe = new SilverAxe(SilverAxeID, SILVERT).setUnlocalizedName("aussiecraft:silverAxe");
		SilverShovel = new SilverShovel(SilverShovelID, SILVERT).setUnlocalizedName("smitecraft:silverShovel");
		SilverHoe = new SilverHoe(SilverHoeID, SILVERT).setUnlocalizedName("smitecraft:silverHoe");
		SilverHammer = new SilverHammer(SilverHammerID, SILVERH).setUnlocalizedName("smitecraft:silverHammer");
		SilverDagger = new SilverDagger(SilverDaggerID, SILVERD).setUnlocalizedName("smitecraft:silverDagger");
		SilverBow = new SilverBow(SilverBowID).setUnlocalizedName("smitecraft:silverBow");
		WoodDagger = new WoodDagger(WoodDaggerID, WOOD).setUnlocalizedName("smitecraft:woodDagger");
		StoneDagger = new StoneDagger(StoneDaggerID, STONE).setUnlocalizedName("smitecraft:stoneDagger");
		IronDagger = new IronDagger(IronDaggerID, IRON).setUnlocalizedName("smitecraft:ironDagger");
		GoldDagger = new GoldDagger(GoldDaggerID, GOLD).setUnlocalizedName("smitecraft:goldDagger");
		DiamondDagger = new DiamondDagger(DiamondDaggerID, DIAMOND).setUnlocalizedName("smitecraft:diamondDagger");
		CopperHelmet = new CopperArmor(CopperHelmetID, COPPERA, proxy.addArmor("Copper"), 0).setUnlocalizedName("smitecraft:copperHelmet");
		CopperPlate = new CopperArmor(CopperPlateID, COPPERA, proxy.addArmor("Copper"), 1).setUnlocalizedName("smitecraft:copperPlate");
		CopperLegs = new CopperArmor(CopperLegsID, COPPERA, proxy.addArmor("Copper"), 2).setUnlocalizedName("smitecraft:copperLegs");
		CopperBoots = new CopperArmor(CopperBootsID, COPPERA, proxy.addArmor("Copper"), 3).setUnlocalizedName("smitecraft:copperBoots");
		CopperPickaxe = new CopperPickaxe(CopperPickaxeID, COPPERT).setUnlocalizedName("smitecraft:copperPickaxe");
		CopperSword = new CopperSword(CopperSwordID, COPPERS).setUnlocalizedName("smitecraft:copperSword");
		CopperAxe = new CopperAxe(CopperAxeID, COPPERT).setUnlocalizedName("aussiecraft:copperAxe");
		CopperShovel = new CopperShovel(CopperShovelID, COPPERT).setUnlocalizedName("smitecraft:copperShovel");
		CopperHoe = new CopperHoe(CopperHoeID, COPPERT).setUnlocalizedName("smitecraft:copperHoe");
		CopperHammer = new CopperHammer(CopperHammerID, COPPERH).setUnlocalizedName("smitecraft:copperHammer");
		CopperDagger = new CopperDagger(CopperDaggerID, COPPERD).setUnlocalizedName("smitecraft:copperDagger");
		CopperBow = new CopperBow(CopperBowID).setUnlocalizedName("smitecraft:copperBow");
		TinHelmet = new CopperArmor(CopperHelmetID, COPPERA, proxy.addArmor("Copper"), 0).setUnlocalizedName("smitecraft:copperHelmet");
		TinPlate = new CopperArmor(CopperPlateID, COPPERA, proxy.addArmor("Copper"), 1).setUnlocalizedName("smitecraft:copperPlate");
		TinLegs = new CopperArmor(CopperLegsID, COPPERA, proxy.addArmor("Copper"), 2).setUnlocalizedName("smitecraft:copperLegs");
		CopperBoots = new CopperArmor(CopperBootsID, COPPERA, proxy.addArmor("Copper"), 3).setUnlocalizedName("smitecraft:copperBoots");
		CopperPickaxe = new CopperPickaxe(CopperPickaxeID, COPPERT).setUnlocalizedName("smitecraft:copperPickaxe");
		CopperSword = new CopperSword(CopperSwordID, COPPERS).setUnlocalizedName("smitecraft:copperSword");
		CopperAxe = new CopperAxe(CopperAxeID, COPPERT).setUnlocalizedName("aussiecraft:copperAxe");
		CopperShovel = new CopperShovel(CopperShovelID, COPPERT).setUnlocalizedName("smitecraft:copperShovel");
		CopperHoe = new CopperHoe(CopperHoeID, COPPERT).setUnlocalizedName("smitecraft:copperHoe");
		CopperHammer = new CopperHammer(CopperHammerID, COPPERH).setUnlocalizedName("smitecraft:copperHammer");
		CopperDagger = new CopperDagger(CopperDaggerID, COPPERD).setUnlocalizedName("smitecraft:copperDagger");
		CopperBow = new CopperBow(CopperBowID).setUnlocalizedName("smitecraft:copperBow");


		//World Gen
		GameRegistry.registerWorldGenerator(new SmiteWorldGen());

		//Smelting
		GameRegistry.addSmelting(SilverOreID, new ItemStack(SilverIngot, 1), 1F);
		GameRegistry.addSmelting(CopperOreID, new ItemStack(CopperIngot, 1), 1F);
		GameRegistry.addSmelting(TinOreID, new ItemStack(TinIngot, 1), 1F);
		GameRegistry.addSmelting(LeadOreID, new ItemStack(LeadIngot, 1), 1F);
		GameRegistry.addSmelting(MercuryOreID, new ItemStack(MercuryIngot, 1), 1F);
		GameRegistry.addSmelting(ZincOreID, new ItemStack(ZincIngot, 1), 1F);
		GameRegistry.addSmelting(ArsenicOreID, new ItemStack(ArsenicIngot, 1), 1F);
		GameRegistry.addSmelting(AntimonyOreID, new ItemStack(AntimonyIngot, 1), 1F);

		//Tool Settings
		MinecraftForge.setToolClass(SilverPickaxe, "pickaxe", 2);
		MinecraftForge.setToolClass(SilverAxe, "axe", 2);
		MinecraftForge.setToolClass(SilverShovel, "shovel", 2);
		MinecraftForge.setToolClass(CopperPickaxe, "pickaxe", 1);
		MinecraftForge.setToolClass(CopperAxe, "axe", 1);
		MinecraftForge.setToolClass(CopperShovel, "shovel", 1);

		//Harvest Levels
		MinecraftForge.setBlockHarvestLevel(SilverOre, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(CopperOre, "pickaxe", 1);
		MinecraftForge.setBlockHarvestLevel(TinOre, "pickaxe", 1);
		MinecraftForge.setBlockHarvestLevel(LeadOre, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(ZincOre, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(MercuryOre, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(ArsenicOre, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(AntimonyOre, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(AntimonyBlock, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(ArsenicBlock, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(MercuryBlock, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(ZincBlock, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(LeadBlock, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(TinBlock, "pickaxe", 1);
		MinecraftForge.setBlockHarvestLevel(CopperBlock, "pickaxe", 1);
		MinecraftForge.setBlockHarvestLevel(SilverBlock, "pickaxe", 2);

		//Crafting Recipes
	}
	public void craftingRecipes(){
		GameRegistry.addRecipe(new ItemStack(smitecraft.SilverPickaxe), new Object[]{
			"SSS", " I ", " I ",
			'S', SilverIngot,
			'I', Item.stick,

		});
		GameRegistry.addRecipe(new ItemStack(smitecraft.SilverShovel), new Object[]{
			" S ", " I ", " I ",
			'S', SilverIngot,
			'I', Item.stick,

		});
		GameRegistry.addRecipe(new ItemStack(smitecraft.SilverAxe), new Object[]{
			"SS ", "SI ", " I ",
			'S', SilverIngot,
			'I', Item.stick,

		});
		GameRegistry.addRecipe(new ItemStack(smitecraft.SilverHoe), new Object[]{
			"SS ", " I ", " I ",
			'S', SilverIngot,
			'I', Item.stick,

		});
		GameRegistry.addRecipe(new ItemStack(smitecraft.SilverSword), new Object[]{
			" S ", " S ", " I ",
			'S', SilverIngot,
			'I', Item.stick,

		});
		GameRegistry.addRecipe(new ItemStack(smitecraft.SilverHammer), new Object[]{
			"SSS", "SIS", " I ",
			'S', SilverIngot,
			'I', Item.stick,

		});
		GameRegistry.addRecipe(new ItemStack(smitecraft.SilverDagger), new Object[]{
			"   ", "  S", " I ",
			'S', SilverIngot,
			'I', Item.stick,

		});
		GameRegistry.addRecipe(new ItemStack(smitecraft.SilverHelmet), new Object[]{
			"SSS", "S S", "   ",
			'S', SilverIngot,

		});
		GameRegistry.addRecipe(new ItemStack(smitecraft.SilverPlate), new Object[]{
			"S S", "SSS", "SSS",
			'S', SilverIngot,

		});
		GameRegistry.addRecipe(new ItemStack(smitecraft.SilverLegs), new Object[]{
			"SSS", "S S", "S S",
			'S', SilverIngot,

		});
		GameRegistry.addRecipe(new ItemStack(smitecraft.SilverBoots), new Object[]{
			"   ", "S S", "S S",
			'S', SilverIngot,

		});
		GameRegistry.addRecipe(new ItemStack(smitecraft.SilverBow), new Object[]{
			" SI", "S I", " SI",
			'S', SilverIngot,
			'I', Item.stick,

		});
		GameRegistry.addRecipe(new ItemStack(smitecraft.SilverBlock), new Object[]{
			"SSS", "SSS", "SSS",
			'S', SilverIngot,

		});
		GameRegistry.addRecipe(new ItemStack(smitecraft.CopperBlock), new Object[]{
			"SSS", "SSS", "SSS",
			'S', CopperIngot,

		});
		GameRegistry.addRecipe(new ItemStack(smitecraft.TinBlock), new Object[]{
			"SSS", "SSS", "SSS",
			'S', TinIngot,

		});
		GameRegistry.addRecipe(new ItemStack(smitecraft.LeadBlock), new Object[]{
			"SSS", "SSS", "SSS",
			'S', LeadIngot,

		});
		GameRegistry.addRecipe(new ItemStack(smitecraft.ZincBlock), new Object[]{
			"SSS", "SSS", "SSS",
			'S', ZincIngot,

		});
		GameRegistry.addRecipe(new ItemStack(smitecraft.MercuryBlock), new Object[]{
			"SSS", "SSS", "SSS",
			'S', MercuryIngot,

		});
		GameRegistry.addRecipe(new ItemStack(smitecraft.ArsenicBlock), new Object[]{
			"SSS", "SSS", "SSS",
			'S', ArsenicIngot,

		});
		GameRegistry.addRecipe(new ItemStack(smitecraft.AntimonyBlock), new Object[]{
			"SSS", "SSS", "SSS",
			'S', AntimonyIngot,
		});
		GameRegistry.addRecipe(new ItemStack(smitecraft.WoodDagger), new Object[]{
			"   ", "  S", " I ",
			'S', Block.planks,
			'I', Item.stick,

		});
		GameRegistry.addRecipe(new ItemStack(smitecraft.StoneDagger), new Object[]{
			"   ", "  S", " I ",
			'S', Block.cobblestone,
			'I', Item.stick,

		});
		GameRegistry.addRecipe(new ItemStack(smitecraft.GoldDagger), new Object[]{
			"   ", "  S", " I ",
			'S', Item.ingotGold,
			'I', Item.stick,

		});
		GameRegistry.addRecipe(new ItemStack(smitecraft.IronDagger), new Object[]{
			"   ", "  S", " I ",
			'S', Item.ingotIron,
			'I', Item.stick,

		});
		GameRegistry.addRecipe(new ItemStack(smitecraft.DiamondDagger), new Object[]{
			"   ", "  S", " I ",
			'S', Item.diamond,
			'I', Item.stick,
		});
		GameRegistry.addRecipe(new ItemStack(smitecraft.CopperHelmet), new Object[]{
			"SSS", "S S", "   ",
			'S', CopperIngot,

		});
		GameRegistry.addRecipe(new ItemStack(smitecraft.CopperPlate), new Object[]{
			"S S", "SSS", "SSS",
			'S', CopperIngot,

		});
		GameRegistry.addRecipe(new ItemStack(smitecraft.CopperLegs), new Object[]{
			"SSS", "S S", "S S",
			'S', CopperIngot,

		});
		GameRegistry.addRecipe(new ItemStack(smitecraft.CopperBoots), new Object[]{
			"   ", "S S", "S S",
			'S', CopperIngot,

		});
		GameRegistry.addRecipe(new ItemStack(smitecraft.CopperPickaxe), new Object[]{
			"SSS", " I ", " I ",
			'S', CopperIngot,
			'I', Item.stick,

		});
		GameRegistry.addRecipe(new ItemStack(smitecraft.CopperShovel), new Object[]{
			" S ", " I ", " I ",
			'S', CopperIngot,
			'I', Item.stick,

		});
		GameRegistry.addRecipe(new ItemStack(smitecraft.CopperAxe), new Object[]{
			"SS ", "SI ", " I ",
			'S', CopperIngot,
			'I', Item.stick,

		});
		GameRegistry.addRecipe(new ItemStack(smitecraft.CopperHoe), new Object[]{
			"SS ", " I ", " I ",
			'S', CopperIngot,
			'I', Item.stick,

		});
		GameRegistry.addRecipe(new ItemStack(smitecraft.CopperSword), new Object[]{
			" S ", " S ", " I ",
			'S', CopperIngot,
			'I', Item.stick,

		});
		GameRegistry.addRecipe(new ItemStack(smitecraft.CopperHammer), new Object[]{
			"SSS", "SIS", " I ",
			'S', CopperIngot,
			'I', Item.stick,

		});
		GameRegistry.addRecipe(new ItemStack(smitecraft.CopperDagger), new Object[]{
			"   ", "  S", " I ",
			'S', CopperIngot,
			'I', Item.stick,

		});


		//Shapeless Recipes
		GameRegistry.addShapelessRecipe(new ItemStack(smitecraft.SilverIngot, 9), new Object[]{
			smitecraft.SilverBlock,
		});
		GameRegistry.addShapelessRecipe(new ItemStack(smitecraft.CopperIngot, 9), new Object[]{
			smitecraft.CopperBlock,
		});
		GameRegistry.addShapelessRecipe(new ItemStack(smitecraft.TinIngot, 9), new Object[]{
			smitecraft.TinBlock,
		});
		GameRegistry.addShapelessRecipe(new ItemStack(smitecraft.LeadIngot, 9), new Object[]{
			smitecraft.LeadBlock,
		});
		GameRegistry.addShapelessRecipe(new ItemStack(smitecraft.ZincIngot, 9), new Object[]{
			smitecraft.ZincBlock,
		});
		GameRegistry.addShapelessRecipe(new ItemStack(smitecraft.MercuryIngot, 9), new Object[]{
			smitecraft.MercuryBlock,
		});
		GameRegistry.addShapelessRecipe(new ItemStack(smitecraft.ArsenicIngot, 9), new Object[]{
			smitecraft.ArsenicBlock,
		});
		GameRegistry.addShapelessRecipe(new ItemStack(smitecraft.AntimonyIngot, 9), new Object[]{
			smitecraft.AntimonyBlock,
		});


		//Entity Registry
		EntityRegistry.registerModEntity(EntityTest.class, "testmob", 1, this, 80, 3, true);
		EntityRegistry.addSpawn(EntityTest.class, 10, 1, 1, EnumCreatureType.monster, BiomeGenBase.beach, BiomeGenBase.desert, BiomeGenBase.extremeHills, BiomeGenBase.taiga, BiomeGenBase.plains, BiomeGenBase.jungle, BiomeGenBase.forest, BiomeGenBase.swampland);
		LanguageRegistry.instance().addStringLocalization("entity.smitecraft.testmob.name", "Zeus");
		EntityRegistry.registerModEntity(EntityHades.class, "hadesmob", 1, this, 80, 3, true);
		EntityRegistry.addSpawn(EntityHades.class, 10, 1, 1, EnumCreatureType.monster, BiomeGenBase.beach, BiomeGenBase.desert, BiomeGenBase.extremeHills, BiomeGenBase.taiga, BiomeGenBase.plains, BiomeGenBase.jungle, BiomeGenBase.forest, BiomeGenBase.swampland);
		LanguageRegistry.instance().addStringLocalization("entity.smitecraft.hadesmob.name", "Hades");
		EntityEgg(EntityTest.class, 0x00D5FF, 0x9000FF);
		EntityEgg(EntityHades.class, 0x00D5FF, 0x9000FF);
		EntityRegistry.registerGlobalEntityID(EntitySilverArrow.class, "SilverArrow", EntityRegistry.findGlobalUniqueEntityId());
		EntityRegistry.registerModEntity(EntitySilverArrow.class, "SilverArrow", 2, this, 128, 1, true);
		LanguageRegistry.instance().addStringLocalization("entity.smitecraft.SilverArrow.name", "Silver Arrow");

		//Block Registry
		GameRegistry.registerBlock(SmiteBlock, "Smite Block");
		GameRegistry.registerBlock(SilverOre, "Silver Ore");
		GameRegistry.registerBlock(CopperOre, "Copper Ore");
		GameRegistry.registerBlock(TinOre, "Tin Ore");
		GameRegistry.registerBlock(LeadOre, "Lead Ore");
		GameRegistry.registerBlock(ZincOre, "Zinc Ore");
		GameRegistry.registerBlock(MercuryOre, "Mercury Ore");
		GameRegistry.registerBlock(ArsenicOre, "Arsenic Ore");
		GameRegistry.registerBlock(AntimonyOre, "Antimony Ore");
		GameRegistry.registerBlock(SilverBlock, "Silver Block");
		GameRegistry.registerBlock(CopperBlock, "Copper Block");
		GameRegistry.registerBlock(TinBlock, "Tin Block");
		GameRegistry.registerBlock(LeadBlock, "Lead Block");
		GameRegistry.registerBlock(ZincBlock, "Zinc Block");
		GameRegistry.registerBlock(MercuryBlock, "Mercury Block");
		GameRegistry.registerBlock(ArsenicBlock, "Arsenic Block");
		GameRegistry.registerBlock(AntimonyBlock, "Antimony Block");

		//Item Registry
		GameRegistry.registerItem(TestItem, "Test Item");
		GameRegistry.registerItem(SilverIngot, "Silver Ingot");
		GameRegistry.registerItem(CopperIngot, "Copper Ingot");
		GameRegistry.registerItem(TinIngot, "Tin Ingot");
		GameRegistry.registerItem(LeadIngot, "Lead Ingot");
		GameRegistry.registerItem(ZincIngot, "Zinc Ingot");
		GameRegistry.registerItem(MercuryIngot, "Mercury Ingot");
		GameRegistry.registerItem(ArsenicIngot, "Arsenic Ingot");
		GameRegistry.registerItem(AntimonyIngot, "Antimony Ingot");
		GameRegistry.registerItem(SilverHelmet, "Silver Helmet");
		GameRegistry.registerItem(SilverPlate, "Silver Chestplate");
		GameRegistry.registerItem(SilverLegs, "Silver Leggings");
		GameRegistry.registerItem(SilverBoots, "Silver Boots");
		GameRegistry.registerItem(SilverPickaxe, "Silver Pickaxe");
		GameRegistry.registerItem(SilverAxe, "Silver Axe");
		GameRegistry.registerItem(SilverShovel, "Silver Shovel");
		GameRegistry.registerItem(SilverSword, "Silver Sword");
		GameRegistry.registerItem(SilverHoe, "Silver Hoe");
		GameRegistry.registerItem(SilverHammer, "Silver Hammer");
		GameRegistry.registerItem(WoodDagger, "Woodern Dagger");
		GameRegistry.registerItem(StoneDagger, "Stone Dagger");
		GameRegistry.registerItem(IronDagger, "Iron Dagger");
		GameRegistry.registerItem(GoldDagger, "Gold Dagger");
		GameRegistry.registerItem(DiamondDagger, "Diamond Dagger");
		GameRegistry.registerItem(SilverDagger, "Silver Dagger");
		GameRegistry.registerItem(SilverBow, "Silver Bow");
		GameRegistry.registerItem(CopperHelmet, "Copper Helmet");
		GameRegistry.registerItem(CopperPlate, "Copper Chestplate");
		GameRegistry.registerItem(CopperLegs, "Copper Leggings");
		GameRegistry.registerItem(CopperBoots, "Copper Boots");
		GameRegistry.registerItem(CopperPickaxe, "Copper Pickaxe");
		GameRegistry.registerItem(CopperAxe, "Copper Axe");
		GameRegistry.registerItem(CopperShovel, "Copper Shovel");
		GameRegistry.registerItem(CopperSword, "Copper Sword");
		GameRegistry.registerItem(CopperHoe, "Copper Hoe");
		GameRegistry.registerItem(CopperHammer, "Copper Hammer");
		GameRegistry.registerItem(CopperDagger, "Copper Dagger");
		GameRegistry.registerItem(CopperBow, "Copper Bow");


		//Language Registry Blocks
		LanguageRegistry.addName(SmiteBlock, "Smite Block");
		LanguageRegistry.addName(SilverOre, "Silver Ore");
		LanguageRegistry.addName(CopperOre, "Copper Ore");
		LanguageRegistry.addName(TinOre, "Tin Ore");
		LanguageRegistry.addName(LeadOre, "Lead Ore");
		LanguageRegistry.addName(ZincOre, "Zinc Ore");
		LanguageRegistry.addName(MercuryOre, "Mercury Ore");
		LanguageRegistry.addName(ArsenicOre, "Arsenic Ore");
		LanguageRegistry.addName(AntimonyOre, "Antimony Ore");
		LanguageRegistry.addName(SilverBlock, "Silver Block");
		LanguageRegistry.addName(CopperBlock, "Copper Block");
		LanguageRegistry.addName(TinBlock, "Tin Block");
		LanguageRegistry.addName(LeadBlock, "Lead Block");
		LanguageRegistry.addName(ZincBlock, "Zinc Block");
		LanguageRegistry.addName(MercuryBlock, "Mercury Block");
		LanguageRegistry.addName(ArsenicBlock, "Arsenic Block");
		LanguageRegistry.addName(AntimonyBlock, "Antimony Block");

		//Language Registry Items
		LanguageRegistry.addName(TestItem, "Testing Item");
		LanguageRegistry.addName(SilverIngot, "Silver Ingot");
		LanguageRegistry.addName(CopperIngot, "Copper Ingot");
		LanguageRegistry.addName(TinIngot, "Tin Ingot");
		LanguageRegistry.addName(LeadIngot, "Lead Ingot");
		LanguageRegistry.addName(ZincIngot, "Zinc Ingot");
		LanguageRegistry.addName(MercuryIngot, "Mercury Ingot");
		LanguageRegistry.addName(ArsenicIngot, "Arsenic Ingot");
		LanguageRegistry.addName(AntimonyIngot, "Antimony Ingot");
		LanguageRegistry.addName(SilverHelmet, "Silver Helmet");
		LanguageRegistry.addName(SilverPlate, "Silver Chestplate");
		LanguageRegistry.addName(SilverLegs, "Silver Leggings");
		LanguageRegistry.addName(SilverBoots, "Silver Boots");
		LanguageRegistry.addName(SilverPickaxe, "Silver Pickaxe");
		LanguageRegistry.addName(SilverShovel, "Silver Shovel");
		LanguageRegistry.addName(SilverAxe, "Silver Axe");
		LanguageRegistry.addName(SilverSword, "Silver Sword");
		LanguageRegistry.addName(SilverHoe, "Silver Hoe");
		LanguageRegistry.addName(SilverHammer, "Silver Hammer");
		LanguageRegistry.addName(SilverDagger, "Silver Dagger");
		LanguageRegistry.addName(WoodDagger, "Woodern Dagger");
		LanguageRegistry.addName(StoneDagger, "Stone Dagger");
		LanguageRegistry.addName(IronDagger, "Iron Dagger");
		LanguageRegistry.addName(GoldDagger, "Gold Dagger");
		LanguageRegistry.addName(DiamondDagger, "Diamond Dagger");
		LanguageRegistry.addName(SilverBow, "Silver Bow");
		LanguageRegistry.addName(CopperHelmet, "Copper Helmet");
		LanguageRegistry.addName(CopperPlate, "Copper Chestplate");
		LanguageRegistry.addName(CopperLegs, "Copper Leggings");
		LanguageRegistry.addName(CopperBoots, "Copper Boots");
		LanguageRegistry.addName(CopperPickaxe, "Copper Pickaxe");
		LanguageRegistry.addName(CopperShovel, "Copper Shovel");
		LanguageRegistry.addName(CopperAxe, "Copper Axe");
		LanguageRegistry.addName(CopperSword, "Copper Sword");
		LanguageRegistry.addName(CopperHoe, "Copper Hoe");
		LanguageRegistry.addName(CopperHammer, "Copper Hammer");
		LanguageRegistry.addName(CopperDagger, "Copper Dagger");
		LanguageRegistry.addName(CopperBow, "Copper Bow");
	}
	//More Entity and Egg Stuff
	public static int getUniqueID(){
		int EntityId = 300;
		do{
			EntityId++;
		} while(EntityList.getStringFromID(EntityId) != null);
		return EntityId;
	}
	public static void EntityEgg(Class<? extends Entity > entity, int primaryColor, int secondaryColor){
		int id = getUniqueID();
		EntityList.IDtoClassMapping.put(id, entity);
		EntityList.entityEggs.put(id, new EntityEggInfo(id, primaryColor, secondaryColor));
	}

	@PostInit
	public void PostLoad(FMLPostInitializationEvent PostEvent) {

	}
}
