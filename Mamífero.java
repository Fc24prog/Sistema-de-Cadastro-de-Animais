package priscillaHeranca;

public class Mamífero  extends Animal
{ 
	private String alimento;
	
	public Mamífero() 
	{		}
	
	public Mamífero(String nome, String cor, String ambiente, double comprimento, int numeroPatas,
			float velocidadeMedia,String alimento)
	{
		super(nome,cor,ambiente,comprimento,numeroPatas, velocidadeMedia);
		this.alimento = alimento;
	}
	

	public String getAlimento() 
	{
		return alimento;
	}

	public void setAlimento(String alimento)
	{
		this.alimento = alimento;
	}
	
	public void ExibirDadosMamifero()
	{
		System.out.println("====== DADOS DO MAMÍFERO(Herdados de Animal) ======");
		super.ExibirDados(); 
		System.out.println("--- Informações Específicas do Mamífero ---");
		System.out.println (" Alimento: " + alimento);
		System.out.println("========================================\n");	
	}}




