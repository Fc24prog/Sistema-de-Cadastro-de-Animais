package priscillaHeranca;

public class Animal {
	

	private String nome,cor,ambiente;
	private double comprimento;
	private int numeroPatas;
	private float velocidadeMedia;
		
	public Animal() 
	
	{  } 
		

	public Animal(String nome, String cor, String ambiente, double comprimento, int numeroPatas,
			float velocidadeMedia) 
	{
		
		this.nome = nome;
		this.cor = cor;
		this.ambiente = ambiente;
		this.comprimento = comprimento;
		this.numeroPatas = numeroPatas;
		this.velocidadeMedia = velocidadeMedia;
	}

	public String getNome() 
	{
		return nome;
	}


	public void setNome(String nome) 
	{
		this.nome = nome;
	}

	public String getCor()
	{
		return cor;
	}


	public void setCor(String cor)
	{
		this.cor = cor;
	}


	public String getAmbiente() 
	{
		return ambiente;
	}


	public void setAmbiente(String ambiente) 
	{
		this.ambiente = ambiente;
	}


	public double getComprimento()
	{
		return comprimento;
	}


	public void setComprimento(double comprimento) 
	{
		this.comprimento = comprimento;
	}


	public int getNumeroPatas()
	{
		return numeroPatas;
	}


	public void setNumeroPatas(int numeroPatas) 
	{
		this.numeroPatas = numeroPatas;
	}


	public float getVelocidadeMedia() 
	{
		return velocidadeMedia;
	}


	public void setVelocidadeMedia(float velocidadeMedia) 
	{
		this.velocidadeMedia = velocidadeMedia;
	}

	public void ExibirDados ()
	{
		System.out.println ("--- Relatório de Dados do Animal ---");
		System.out.println ("Nome: " + nome);
		System.out.println ("Cor: " + cor); 
		System.out.println ("Ambiente: " + ambiente);
		System.out.println ("Comprimento: " + comprimento + " m"); 
		System.out.println ("Número de Patas: " + numeroPatas);
		System.out.println ("Velocidade Média: " + velocidadeMedia + " km/h");
		System.out.println ("------------------------------------");
	}}
