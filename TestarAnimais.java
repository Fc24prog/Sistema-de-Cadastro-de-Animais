package  projetoHeranca;
public class TestarAnimais {
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Animal n1 = new Animal ("Borboleta", "Amarela", "Ar", 0.23,0,25);
		Peixe p1= new Peixe ("Sardinha","Mesclado","Água",25,0,250,"Laranja");
		Mamífero m1 = new Mamífero ("Marley","Branco","Casa",63,4,200,"ração");
		
		
        n1.ExibirDados();
		p1.ExibirDadosPeixe();
		m1.ExibirDadosMamifero();

}}
/*

Animal tem :  
nome, cor,ambiente,comprimento,numeroPatas,velocidadeMedia

Peixe tem: 
Animal+ caracteristica

Mamifero tem:

Animal + Alimento.
*/ 
