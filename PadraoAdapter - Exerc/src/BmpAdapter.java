
public class BmpAdapter extends BmpImage implements ImagemTarget {

	@Override
	public void carregarImagem(String nomeDoArquivo) {
		bmpCarregarImagem(nomeDoArquivo);
	}

	@Override
	public void desenharImagem(int posX, int posY, int largura, int altura) {
		bmpDesenharImagem(posX, posY);
	}

}
