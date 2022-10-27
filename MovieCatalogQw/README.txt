==== Unit Testing

* MoviesViewModelTest
	* Memuat Movies
		* Memastikan data movies tidak null
		* Memastikan jumlah data movies sesuai dengan yang diharapkan
* TvShowsViewModeltest
	* Memuat TvShows
		* Memastikan data tvShows tidak null
		* Memastikan jumlah data tvShows sesuai dengan yang diharapkan

==== Instrumental Testing

* MoviesFragmentTest
	* Memuat Movies
		* Membuka Halaman MoviesFragment
		* Memastikan RecyclerView dalam keadaan tampil
		* Memastikan jumlah item RecyclerView sesuai sesuai dengan yang diharapkan
* TvShowFragmentTest
	* Memuat TvShows
		* Membuka Halaman TvShowsFragment
		* Memastikan RecyclerView dalam keadaan tampil
		* Memastikan jumlah item RecyclerView sesuai sesuai dengan yang diharapkan
* DetailActivityTest
	* Memuat Movies
		* Membuka Halaman DetailMoviesActivity
		* Memastikan TextView untuk title sudah tampil
		* Memastikan value dari title sesuai dengan yang diharapkan
		* Memastikan TextView untuk year sudah tampil
		* Memastikan value dari year sesuai dengan yang diharapkan
		* Memastikan TextView untuk score sudah tampil
		* Memastikan value dari score sesuai dengan yang diharapkan
		* Memastikan TextView untuk description sudah tampil
		* Memastikan value dari description sesuai dengan yang diharapkan
		* Memastikan GridView dari genre sudah tampil
		* Memastikan ImageView dari poster sudah tampil
		