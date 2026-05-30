package priscillaHeranca;

public class Peixe extends Animal 
{
	private String caracteristica;
		
	public Peixe() 

	{  	}
	
	public Peixe(String nome, String cor, String ambiente, double comprimento, int numeroPatas,
			float velocidadeMedia,String caracteristica) 
	{
		super(nome,cor,ambiente,comprimento,numeroPatas, velocidadeMedia);
		this.caracteristica =caracteristica;
	}
	
	public String getCaracteristica()
	{
		return caracteristica;
	}

	public void setCaracteristica(String caracteristica)
	{
		this.caracteristica = caracteristica;
	}

	public void ExibirDadosPeixe() 
	{
		System.out.println("====== DADOS DO PEIXE (Herdados de Animal) ======");
		super.ExibirDados(); 
		System.out.println("--- Informações Específicas de Peixe ---");
		System.out.println("Característica: " + caracteristica);
		System.out.println("========================================\n");
	}}



