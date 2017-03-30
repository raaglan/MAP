
public class JpegAdapter extends JpegImage implements ImagemTarget{

		@Override
		public void carregarImagem(String nomeDoArquivo) {
			jpegCarregarImagem(nomeDoArquivo);
		}

		@Override
		public void desenharImagem(int posX, int posY, int largura, int altura) {
			jpegDesenharImagem(posX, posY);
		}

}
