package oop_00000127746_TitoShafy.week05

fun main() {
    val dosen1 = Dosen("Pak Alex", "0123456")
    val admin1 = Admin("Bu Siti")

    val daftarPegawai: List<Pegawai> = listOf(dosen1, admin1)

    println("=== AKTIVITAS PEGAWAI ===")
    for (Pegawai in daftarPegawai) {
        Pegawai.bekerja()

        when (Pegawai) {
            is Dosen -> {
                println("=> Terdeteksi sebagai Dosen (NIDN: ${Pegawai.nidn}")
                Pegawai.mengajar()
            }
            is Admin -> {
                println("=> Terdeteksi sebagai Admin")
                Pegawai.doAdminWork()
            }
        }
        println("-------------------------")
    }
}