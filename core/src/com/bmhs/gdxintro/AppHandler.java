package com.bmhs.gdxintro;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.utils.ScreenUtils;
import com.bmhs.gdxintro.gfx.assets.Tile;
import com.bmhs.gdxintro.gfx.utils.TileHandler;

public class AppHandler extends ApplicationAdapter {
	SpriteBatch batch;



	int x, y;


	int[][] Canvas = {{0, 0, 0, 0, 0, 4, 4, 4, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
					 {0, 0, 0, 0, 4, 4, 3, 3, 3, 4, 4, 4, 4, 4, 4, 0, 0, 0, 0, 0},
					 {0, 0, 0, 0, 0, 0, 4, 4, 4, 3, 3, 3, 4, 0, 0, 4, 0, 0, 0, 0},
					 {0, 0, 0, 0, 0, 0, 4, 3, 3, 2, 2, 4, 3, 0, 0, 0, 4, 0, 0, 0},
					 {0, 0, 0, 0, 0, 4, 3, 2, 2, 2, 2, 4, 3, 0, 0, 4, 0, 4, 0, 0},
					 {4, 4, 0, 0, 4, 2, 2, 2, 2, 2, 2, 4, 3, 0, 0, 4, 0, 4, 0, 0},
					 {4, 3, 4, 0, 4, 2, 2, 2, 2, 2, 2, 2, 4, 3, 0, 0, 0, 4, 0, 0},
					 {0, 4, 1, 4, 2, 2, 2, 2, 2, 2, 2, 2, 2, 4, 4, 4, 4, 4, 4, 0},
					 {0, 4, 1, 4, 2, 2, 2, 2, 2, 2, 2, 2, 4, 3, 3, 3, 3, 3, 3, 4},
					 {0, 4, 4, 0, 4, 1, 4, 3, 3, 4, 1, 4, 3, 4, 4, 4, 4, 4, 4, 0},
					 {0, 4, 0, 0, 0, 4, 4, 3, 4, 1, 1, 1, 4, 3, 3, 3, 3, 3, 4, 0},
					 {0, 0, 0, 0, 0, 0, 4, 4, 1, 1, 1, 1, 1, 4, 4, 4, 4, 4, 0, 0},
				 	 {0, 0, 0, 0, 0, 0, 0, 0, 4, 4, 4, 4, 4, 0, 0, 0, 0, 0, 0, 0}};




//	int[][] worldIntArray = new int[12][20];

	@Override
	public void create () {
		batch = new SpriteBatch();



		x = 0;
		y = 0;
	}

	private void setRandomArray() {
		for(int r = 0; r < Canvas.length; r++) {
			for(int c = 0; c < Canvas[r].length; c++) {
				Canvas[r][c] = MathUtils.random(4);
			}
		}
	}


	@Override
	public void render () {
		ScreenUtils.clear(1, 0, 0, 1);
		batch.begin();

		for(int r = 0; r < Canvas.length; r++) {
			for (int c = 0; c < Canvas[r].length; c++) {
				batch.draw(TileHandler.getTileHandler().getWorldTileArray().get(Canvas[r][c]).getTexture(), c * 32, Gdx.graphics.getHeight() - 32 - (r * 32));

			}
		}

		/*
		for(int r = 0; r < Gdx.graphics.getHeight(); r+=64) {
			for(int c = 0; c < Gdx.graphics.getWidth(); c+=64) {
				batch.draw(TileHandler.getTileHandler().getWorldTileArray().get(x++).getTexture(), c, r);
				if(x > 4) {
					x = 0;
				}
			}
		}
		*/


		batch.end();

		checkInput();
	}

	public void checkInput() {
		/*
		if(Gdx.input.isKeyJustPressed(Input.Keys.W)) {
			y += 10;
		}
		if(Gdx.input.isKeyJustPressed(Input.Keys.A)) {
			x -= 10;
		}
		if(Gdx.input.isKeyJustPressed(Input.Keys.S)) {
			y -= 10;
		}
		if(Gdx.input.isKeyJustPressed(Input.Keys.D)) {
			x += 10;
		}



		System.out.println(Gdx.input.getX() + " " + Gdx.input.getY());

		x = Gdx.input.getX() - img.getWidth()/2;
		y = Gdx.graphics.getHeight() - Gdx.input.getY() - img.getHeight()/2;



		if(x < (Gdx.input.getX() - img.getWidth()/2)) {
			x += 20;
		}
		if(x > (Gdx.input.getX() - img.getWidth()/2)) {
			x -= 20;
		}
		if(y > (Gdx.graphics.getHeight() - Gdx.input.getY() - img.getHeight()/2)) {
			y -= 20;
		}
		if(y < (Gdx.graphics.getHeight() - Gdx.input.getY() - img.getHeight()/2)) {
			y += 20;
		}
*/



	}
	
	@Override
	public void dispose () {
		batch.dispose();
	}
}
